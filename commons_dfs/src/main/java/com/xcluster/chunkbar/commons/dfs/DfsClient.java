package com.xcluster.chunkbar.commons.dfs;

import com.xcluster.chunkbar.commons.dfs.data.DfsStatistics;

import java.io.Closeable;

/**
 * @author xyh
 * dfs客户端
 */
public abstract class DfsClient implements Closeable{

    /**
     * 获取session
     * @return
     */
    public abstract DfsSession getSession();

    /**
     * 获取dfs统计信息
     * @return
     */
    public abstract DfsStatistics getStatistics();

}
