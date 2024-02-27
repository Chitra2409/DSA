package Recursion;
import java.util.*;
public class getMazePathJ {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();

        ArrayList<String> rpaths= getMazePathsJ(1,1,n,m);
        System.out.println(rpaths);
    }
    public static ArrayList<String> getMazePathsJ(int sr, int sc, int dr, int dc){
        if(sr==dr && sc==dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres; 
        }
        ArrayList<String> paths= new ArrayList<>();
        //for horizontal moves
        for(int ms=1;ms<=dc-sc;ms++){
            ArrayList<String> hpaths= getMazePathsJ(sr, sc+ms, dr, dc);
            for(String hpath:hpaths){
                paths.add("h"+ms+hpath);
            }
        }
        //for vertical moves
        for(int ms=1;ms<=dr-sr;ms++){
            ArrayList<String> vpaths= getMazePathsJ(sr+ms, sc, dr, dc);
            for(String vpath:vpaths){
                paths.add("v"+ms+vpath);
            }
        }
        //for diagonal moves
        for(int ms=1;ms<=dr-sr && ms<=dc-sc;ms++){
            ArrayList<String> dpaths= getMazePathsJ(sr+ms, sc+ms, dr, dc);
            for(String dpath:dpaths){
                paths.add("d"+ms+dpath);
            }
        }
        

        return paths;
    }
    
}
