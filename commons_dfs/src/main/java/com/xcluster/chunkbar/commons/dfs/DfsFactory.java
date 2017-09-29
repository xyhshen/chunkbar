package com.xcluster.chunkbar.commons.dfs;

import java.util.Properties;

/**
 * dfs创建工厂
 * @author xyh
 */
public interface DfsFactory {

    /**
     * 创建客户端
     * @param properties
     * @return
     */
    DfsClient createClient(Properties properties);

}
