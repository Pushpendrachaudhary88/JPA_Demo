package com.HindustaniBhau.JPAdemo;

import javax.persistence.*;

@Entity

public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private  int cardNo;
   private  String dob;
     @Enumerated(EnumType.STRING)    // to store in own  in databases.
     Status status ;

     @OneToOne
     @JoinColumn  // join based on p.k by default it is always in the child class. to connect the child to parent cls.
     User user;

     public Card(){

     }

    public Card(int cardNo,  String dob, Status status) {
        this.cardNo = cardNo;
        this.dob = dob;
        this.status = status;
    }

    public int getCardNo() {
        return cardNo;
    }

    public void setCardNo(int cardNo) {
        this.cardNo = cardNo;
    }


    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
