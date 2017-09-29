package com.xcluster.chunkbar.commons.dfs;

import com.xcluster.chunkbar.commons.dfs.data.DfsFile;

import java.io.Closeable;
import java.io.Flushable;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author xyh
 * dfs文件系统借口
 */
public abstract class DfsSession implements Closeable,Flushable{

    /**
     * 写入文件
     * @param is
     * @return 文件描述
     * @throws Exception
     */
    public abstract DfsFile writeFile(InputStream is) throws Exception;

    /**
     * 追加写入文件
     * @param fileurl
     * @param is
     * @return 文件描述
     * @throws Exception,com.xcluster.chunkbar.commons.dfs.exception.DfsFileNotFoundException
     */
    public abstract DfsFile writeFile(String fileurl,InputStream is) throws Exception;

    /**
     * 读取文件
     * @param fileurl
     * @param os
     * @throws Exception,com.xcluster.chunkbar.commons.dfs.exception.DfsFileNotFoundException
     */
    public abstract void readFile(String fileurl, OutputStream os) throws Exception;

    /**
     * 读取文件
     * @param fileurl
     * @param offset
     * @param os
     * @throws Exception,com.xcluster.chunkbar.commons.dfs.exception.DfsFileNotFoundException
     */
    public abstract void readFile(String fileurl,long offset,OutputStream os) throws Exception;

    /**
     * 删除文件
     * @param fileurl
     */
    public abstract void delete(String fileurl);

    /**
     * 获取文件描述
     * @param fileurl
     * @return 为null为不存在
     */
    public abstract DfsFile stat(String fileurl);

}
