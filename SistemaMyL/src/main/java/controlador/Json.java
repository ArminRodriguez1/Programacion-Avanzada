/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import carta.Carta;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author Usuario
 */
public class Json {

    private static final String RUTA = "data/";
    private static final String NOMBRE = "objetos.json";

    public static ArrayList<Carta> recurperarObjetos() {
        Gson gson = new Gson();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(RUTA+NOMBRE));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        ArrayList<Carta> carta = gson.fromJson(br, new TypeToken<List<Carta>>() {}.getType());
        System.out.println(carta);
        return carta;
        
    }

}
