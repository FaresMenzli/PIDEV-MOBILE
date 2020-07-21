/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.Service;

import com.codename1.io.CharArrayReader;
import com.codename1.io.ConnectionRequest;
import com.codename1.io.JSONParser;
import com.codename1.io.NetworkEvent;
import com.codename1.io.NetworkManager;
import com.codename1.ui.events.ActionListener;
import com.esprit.Entite.Question;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import utils.PublicVars;


/**
 *
 * @author MKadmin
 */
public class ServiceQuestion {
    ArrayList<Question> listQuestions;
public ArrayList<Question> parseQuestion(String json) {
        System.out.println(json);
        ArrayList<Question> listQuestion = new ArrayList<>();

        try {
            JSONParser j = new JSONParser();

            Map<String, Object> Questions = j.parseJSON(new CharArrayReader(json.toCharArray()));
           
            List<Map<String, Object>> list = (List<Map<String, Object>>) Questions.get("root");

            for (Map<String, Object> obj : list) {
                Question e = new Question();
                float id = Float.parseFloat(obj.get("Q_id").toString());
                System.out.println(id);
                e.setQ_id((int) id);
                
                e.setQuestion(obj.get("Question").toString());
                System.out.println(e);
                listQuestion.add(e);
            }

        } catch (IOException ex) {
        }
        return listQuestion;

    }
public ArrayList<Question> getQuestion(){
        listQuestions = new ArrayList<>();
        ConnectionRequest con = new ConnectionRequest();
        con.setUrl(PublicVars.ipAdress);  
        con.setPost(false);
        con.addResponseListener(new ActionListener<NetworkEvent>() {
            @Override
            public void actionPerformed(NetworkEvent evt) {
                ServiceQuestion ser = new ServiceQuestion();
                listQuestions = ser.parseQuestion(new String(con.getResponseData()));
            }
        });
        NetworkManager.getInstance().addToQueueAndWait(con);
        return listQuestions;
    }
public ArrayList<Question> getOneQuestion(int i){
        listQuestions = new ArrayList<>();
        ConnectionRequest con = new ConnectionRequest();
        con.setUrl(PublicVars.ipAdress+""+i);  
        con.setPost(false);
        con.addResponseListener(new ActionListener<NetworkEvent>() {
            @Override
            public void actionPerformed(NetworkEvent evt) {
                ServiceQuestion ser = new ServiceQuestion();
                listQuestions = ser.parseQuestion(new String(con.getResponseData()));
            }
        });
        NetworkManager.getInstance().addToQueueAndWait(con);
        return listQuestions;
    }
//boucle qzestion
public int nombrequestion (){
  
       listQuestions = new ArrayList<>();
        ConnectionRequest con = new ConnectionRequest();
        con.setUrl(PublicVars.ipAdress);  
        con.setPost(false);
        con.addResponseListener(new ActionListener<NetworkEvent>() {
            @Override
            public void actionPerformed(NetworkEvent evt) {
                ServiceQuestion ser = new ServiceQuestion();
                listQuestions = ser.parseQuestion(new String(con.getResponseData()));
            }
        });
        NetworkManager.getInstance().addToQueueAndWait(con);
        return listQuestions.size(); 
}
public void insertreponse(int i , String reponse){
        listQuestions = new ArrayList<>();
        ConnectionRequest con = new ConnectionRequest();
        con.setUrl(PublicVars.ipAdress+"post/"+i+"/"+reponse);  
        con.setPost(true);
  NetworkManager.getInstance().addToQueueAndWait(con);}
public String testquestion () {
    String question ="";
    
    
    return question ;

}
    
}
