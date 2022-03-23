package org.alex.words.filter.result;

public class FilteredResult {

	private Double level;// 文本最终警告级别
	private String filteredContent;// 屏蔽敏感词后的文本内容
	private String badWords;// 屏蔽的敏感词串,eg:色魔,法轮功,GCD
	private String goodWords;// 检索到的正向单词
	private String originalContent;//原始内容
	private Boolean hasSensiviWords=false;//是否有敏感词

	public String getBadWords() {
		return badWords;
	}

	public void setBadWords(String badWords) {
		this.badWords = badWords;
	}

	public FilteredResult() {

	}

	public FilteredResult(String originalContent, String filteredContent, Double level, String badWords) {
		this.originalContent=originalContent;
		this.filteredContent = filteredContent;
		this.level = level;
		this.badWords = badWords;
	}

	public Double getLevel() {
		return level;
	}

	public void setLevel(Double level) {
		this.level = level;
	}

	public String getFilteredContent() {
		return filteredContent;
	}

	public void setFilteredContent(String filteredContent) {
		this.filteredContent = filteredContent;
	}

	public String getOriginalContent() {
		return originalContent;
	}

	public void setOriginalContent(String originalContent) {
		this.originalContent = originalContent;
	}

	public String getGoodWords() {
		return goodWords;
	}

	public void setGoodWords(String goodWords) {
		this.goodWords = goodWords;
	}

	public Boolean getHasSensiviWords() {
		return hasSensiviWords;
	}

	public void setHasSensiviWords(Boolean hasSensiviWords) {
		this.hasSensiviWords = hasSensiviWords;
	}
}
