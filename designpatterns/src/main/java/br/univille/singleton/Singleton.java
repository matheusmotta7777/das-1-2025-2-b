package br.univille.singleton;

public class Singleton {
    //parece uma variavel global
    private static Singleton instance;

    private Singleton(){
        //ninguem pode instanciar, só ela mesma

    }
    public static Singleton getInstance(){
        if (instance ==null){
            instance = new Singleton();
        }
        return instance;
    }
}
