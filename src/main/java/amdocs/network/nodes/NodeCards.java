package amdocs.network.nodes;

public class NodeCards extends NodePorts{
    
    public enum TypeCard {OPT, ETH, WIFI}

    public int cardCapcty = 2;//Quantidade de portas da placa
    public Boolean cardStatus = false;//Status da placa (ON-OFF)
    public TypeCard cardType;//Tipo de placa (Tecnologia)
    
}
