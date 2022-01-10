package com.tool.chien_file_manage.simplefileexplorer;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.tool.chien_file_manage.R;


class SimpleFileExplorerViewHolder extends RecyclerView.ViewHolder{
    public ConstraintLayout backgroundConstraintLayout;
    public TextView fileAbsolutePathTextView;
    public ImageView fileImageView;


    public SimpleFileExplorerViewHolder(@NonNull View itemView) {
        super(itemView);
        this.backgroundConstraintLayout = itemView.findViewById(R.id.cl_background);
        this.fileAbsolutePathTextView = itemView.findViewById(R.id.tv_file_absolute_path);
        this.fileImageView = itemView.findViewById(R.id.iv_file);
    }
}
