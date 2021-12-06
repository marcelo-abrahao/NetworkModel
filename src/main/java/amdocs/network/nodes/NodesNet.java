package amdocs.network.nodes;

import java.util.*;
import amdocs.network.links.*;

public class NodesNet extends NodeCards {

    public String nodeName;//Nome do Node
    public String nodeType;//Tipo do Node
    public int nodeID;//Identificação do Node
    public int nodeChassi = 1;//Quantidade de porta padrão em todo Node
    public String nodeLevel = "Terminal";
    private ArrayList<NodeCards> nodeCards;//Quantidade de Cards do Node
    private ArrayList<NodePorts> nodePorts;//Portas disponível no Node

    
    //Get for cards list
    private ArrayList<NodeCards> getNodeCard() {
        if (nodeCards == null){
            nodeCards = new ArrayList<NodeCards>();
        }
        return nodeCards;
    }

    //Validando as informações (sem estender a class)
    public void addCards(NodeCards cards){
        if(cards == null){
            throw new NullPointerException("Necessário adicionar 1 porta.");
        }
        if(Boolean.TRUE.equals(cards.cardStatus)){
            throw new NullPointerException("Placa deve estar desativada para adiciona-la.");
        }
        if(cards.cardCapcty <= 0){
            throw new NullPointerException("Necessário informar Capacidade da Placa.(Num de Portas)");
        }
        getNodeCard().add(cards);
    }

    //Get para confirmar a adição de portas
    private ArrayList<NodePorts> getNodePorts() {
        if (nodePorts == null){
            nodePorts = new ArrayList<NodePorts>();
        }
        return nodePorts;
    }

    //Validando as informações (sem estender a class)
    public void addPorts(NodePorts ports){
        if(ports == null){
            throw new NullPointerException("Necessário adicionar 1 porta.");
        }
        if(Boolean.TRUE.equals(ports.portStatus)){
            throw new NullPointerException("Porta deve estar desativada para adiciona-la.");
        }
        if(ports.portCapcty == null){
            throw new NullPointerException("Necessário informar Capacidade da Porta.(Mbps)");
        }
        getNodePorts().add(ports);
    }

    //Get and Set of class
    public int getNodeID() {
        return nodeID;
    }

    public void setNodeID(int nodeID) {
        this.nodeID = nodeID;
    }
   
	public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }
 
    public String getNodeLevel() {
        return nodeLevel;
    }

    public void setNodeLevel(String nodeLevel) {
        this.nodeLevel = nodeLevel;
    }

    public boolean isTerminal() {
        return getNodeLevel().equals("Terminal");
    }
    
}