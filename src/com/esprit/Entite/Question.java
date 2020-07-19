/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.Entite;

/**
 *
 * @author MKadmin
 */
public class Question {
      private int Q_id ;
    private String Question ;

    public Question(int Q_id, String Question) {
        this.Q_id = Q_id;
        this.Question = Question;
    }

    public Question() {
    }
    

    public int getQ_id() {
        return Q_id;
    }

    public void setQ_id(int Q_id) {
        this.Q_id = Q_id;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String Question) {
        this.Question = Question;
    }

    @Override
    public String toString() {
        return "Question{" + "Q_id=" + Q_id + ", Question=" + Question + '}';
    }
    
    
    
}


