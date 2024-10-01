package BufferReader;

import java.io.InputStreamReader;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;

public class bufferReader {
    public static void main(String args[]){
    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader bf =  new BufferedReader(in);
    try{
        int num =Integer.parseInt(bf.readLine());
        System.out.println(num);
    }
    catch(IOException e){
     System.out.println(e);
    }
   
    }
}
