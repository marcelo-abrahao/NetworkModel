package amdocs.network;

import amdocs.network.nodes.*;
import amdocs.network.links.*;

public final class NetworkModel {

    private NetworkModel() {
    } 
    public static void main(String[] args) {

    NodesNet node1 = new NodesNet();
    NodesNet node2 = new NodesNet();
    NodesNet node3 = new NodesNet();

    Links link1 = new Links();
    Links link2 = new Links();

    node1.addPorts(node1);
    node1.addCards(node1);
    node2.addPorts(node2);
    node2.addCards(node2);
    node3.addPorts(node3);
    node3.addCards(node3);
    
    link1.setStartID(node1.getNodeID());
    link1.setEndID(node2.getNodeID());

    link2.setStartID(node2.getNodeID());
    link2.setEndID(node3.getNodeID());

    System.out.println("Placas e Portas Adicionadas!");
    System.out.println("Links Criados!");
    System.out.println("Rede Conectada!");

    System.out.println(node1.isTerminal());

    } 
}
