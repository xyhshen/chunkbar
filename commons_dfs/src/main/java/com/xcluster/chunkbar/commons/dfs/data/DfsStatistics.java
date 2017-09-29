package com.xcluster.chunkbar.commons.dfs.data;

import java.util.List;

public class DfsStatistics {

    private long totalSize;

    private int totalServer;

    private List<String> serverList;

    private List<DfsVolumn> volumns;

    public long getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(long totalSize) {
        this.totalSize = totalSize;
    }

    public int getTotalServer() {
        return totalServer;
    }

    public void setTotalServer(int totalServer) {
        this.totalServer = totalServer;
    }

    public List<String> getServerList() {
        return serverList;
    }

    public void setServerList(List<String> serverList) {
        this.serverList = serverList;
    }

    public List<DfsVolumn> getVolumns() {
        return volumns;
    }

    public void setVolumns(List<DfsVolumn> volumns) {
        this.volumns = volumns;
    }
}
