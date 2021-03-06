package net.gabor6505.imageorganizer.xml;

public class Node extends NodeList {

    private final org.w3c.dom.Node node;

    public Node(org.w3c.dom.Node node) {
        super(node.getChildNodes());
        this.node = node;
    }

    public Node() {
        this.node = null;
    }

    public org.w3c.dom.Node getNode() {
        return node;
    }

    public String getNodeName() {
        return node.getNodeName();
    }

    public String getTextContent() {
        if (node == null) return null;
        else return node.getTextContent();
    }

    public Node getNodeAttribute(String attrName) {
        return new Node(node.getAttributes().getNamedItem(attrName));
    }

    public String getNodeAttributeContent(String attrName) {
        if (node.getAttributes() == null) return null;
        if (node.getAttributes().getNamedItem(attrName) == null) return null;
        return node.getAttributes().getNamedItem(attrName).getTextContent();
    }
}
