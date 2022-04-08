package com.vti.entity;

import com.vti.entity.Question;

public class Answer {
	private int AnswerID;
	private String AnswerContent;
	private Question QuestionID;
	private boolean isCorrect;
	public int getAnswerID() {
		return AnswerID;
	}
	public void setAnswerID(int answerID) {
		AnswerID = answerID;
	}
	public String getAnswerContent() {
		return AnswerContent;
	}
	public void setAnswerContent(String answerContent) {
		AnswerContent = answerContent;
	}
	public Question getQuestionID() {
		return QuestionID;
	}
	public void setQuestionID(Question questionID) {
		QuestionID = questionID;
	}
	public boolean isCorrect() {
		return isCorrect;
	}
	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}

}