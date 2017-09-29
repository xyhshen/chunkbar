package com.xcluster.chunkbar.commons.dfs.data;

import java.io.Closeable;
import java.io.InputStream;

/**
 * dfs文件描述
 * @author xyh
 */
public class DfsFile{

    /**
     * 文件url
     */
    private String fileurl;

    /**
     * 文件大小
     */
    private long fileSize;

    public long getFileSize() {
        return fileSize;
    }

    public String getFileurl() {
        return fileurl;
    }

    public void setFileurl(String fileurl) {
        this.fileurl = fileurl;
    }

    public void setFileSize(long fileSize) {

        this.fileSize = fileSize;
    }

}
