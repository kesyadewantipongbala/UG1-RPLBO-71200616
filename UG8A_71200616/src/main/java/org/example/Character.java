package org.example;

public abstract class Character implements ObjectAttack{
    private int damage;
    private String name;
    private int health;

    public Character(String name,int damage,int health){
    }

    public Character() {

    }

    public void showCharacterInfo(){

    }

    public boolean isDie(){
        return false;
    }

    public void attacked(int demage){

    }

}
