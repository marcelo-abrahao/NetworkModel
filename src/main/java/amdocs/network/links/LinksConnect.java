package amdocs.network.links;

import amdocs.network.nodes.NodesNet;

public class LinksConnect extends Links{

    private NodesNet start;
    private NodesNet end;
    private String linkID;

    public NodesNet getStart() {
        return start;
    }

    public NodesNet getEnd() {
        return end;
    }

    public void setStart(NodesNet start) {
        this.start = start;
        this.setStartID(start.getNodeID());
    }

    public void setEnd(NodesNet end) {
        this.end = end;
        this.setEndID(end.getNodeID());
    }

    public String getLinkID() {
        return linkID;
    }

    public void setLinkID(String linkID) {
        this.linkID = linkID;
        this.linkID = "Seu link ID" + linkID ;
    }

}
