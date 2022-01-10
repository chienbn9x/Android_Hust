package com.tool.chien_file_manage.simplefileexplorer;

import java.io.Serializable;

interface ActivityListener extends Serializable {
    void onDirectoryChanged(String absolutePath);
    void onFileSelect(FileModel fileModel);
    void onBackButtonPressed(String absolutePath);
}
