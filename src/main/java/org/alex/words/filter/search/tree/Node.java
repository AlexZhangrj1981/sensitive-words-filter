package org.alex.words.filter.search.tree;

import java.util.HashMap;
import java.util.Map;

public class Node {
//	private char[] chars = new char[0];
//	private boolean isEnd = false;
//	private Node[] children = new Node[0];
//	
//	public Node addChar(char c){
//		for(int i=0;i<chars.length;i++){
//			if(chars[i]==c)return children[i];
//		}
//		char[] charTmp = new char[chars.length+1];
//		Node[] nodeTmp = new Node[children.length+1];
//		for(int i=0;i<chars.length;i++){
//			charTmp[i]=chars[i];
//			nodeTmp[i]=children[i];
//		}
//		charTmp[chars.length]=c;
//		nodeTmp[chars.length]=new Node();
//		chars=charTmp;
//		children=nodeTmp;
//		return children[children.length-1];
//	}
//	public Node findChar(char c){
//		for(int i=0;i<chars.length;i++){
//			if(chars[i]==c)return children[i];
//		}
//		return null;
//	}
//	public char[] getChars() {
//		return chars;
//	}
//	public void setChars(char[] chars) {
//		this.chars = chars;
//	}
//	public boolean isEnd() {
//		return isEnd;
//	}
//	public void setEnd(boolean isEnd) {
//		this.isEnd = isEnd;
//	}
//	public Node[] getChildren() {
//		return children;
//	}
//	public void setChildren(Node[] children) {
//		this.children = children;
//	}

	private Map<String,Node> children = new HashMap<String,Node>(0);
	private boolean isEnd = false;
	private String word;
	private double level =0;
	
	public Node addChar(char c) {
		String cStr = String.valueOf(c);
		Node node = children.get(cStr);
		if(node == null){
			node = new Node();
			children.put(cStr, node);
		}
		return node;
	}
	
	public Node findChar(char c){
		String cStr = String.valueOf(c);
		return children.get(cStr);
	}

	public boolean isEnd() {
		return isEnd;
	}

	public void setEnd(boolean isEnd) {
		this.isEnd = isEnd;
	}

	public double getLevel() {
		return level;
	}

	public void setLevel(double level) {
		this.level = level;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
}
