package amdocs.network.nodes;

public class NodePorts {

    public enum TypePorts {OPT, ETH, WIFI}

    public Float portCapcty = 100.0f;//Througput máximo da porta
    public Boolean portStatus = false;//Status da porta (ON-OFF)
    public TypePorts portType;//Tipo de porta (Tecnologia)
    
}