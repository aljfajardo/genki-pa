package com.example.android.learningaid;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by admin on 4/4/18.
 */

public class LessonViewAdapter extends RecyclerView.Adapter<LessonViewAdapter.LessonViewHolder> {

    private int mLessonCount;

    public LessonViewAdapter(int lessonCount) {
        mLessonCount = lessonCount;
    }

    @Override
    public LessonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.lesson_list_item;
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(layoutIdForListItem, parent, false);

        return new LessonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(LessonViewHolder holder, int position) {
        holder.setViewContent("Lesson " + (++position));
    }

    @Override
    public int getItemCount() {
        return mLessonCount;
    }

    class LessonViewHolder extends RecyclerView.ViewHolder {

        TextView mLessonListItemView;

        public LessonViewHolder(View itemView){

            super(itemView);

            mLessonListItemView = (TextView) itemView.findViewById(R.id.tv_lesson_title);
        }

        void setViewContent(String content) {
            mLessonListItemView.setText(content);
        }

    }
}
