
/* 


15.12.2017
This is an FTPClient app that will utilise Apache Commons Net libraries for convenience.
https://commons.apache.org/proper/commons-net/

They are installed in a series of subfolders inside a 'java' folder.

Place this file in the main 'java' folder supplied by the Commons Net java packages.

The SocketClient.java file is located there, and as the FTPClient extends SocketClient it will easily find it.
Each Apache Commons file has a 'package' command that helps identify its folder path for the Java compiler.
Any specific classes required by this App should use the 'import' command but the dependencies of those files should be found by the Java compiler without further info.
Import using * to get all files in the ftp folder; otherwise specify the FTPClient.java file directly
*/

import org.apache.commons.net.ftp.*;
import java.io.IOException;
import java.util.*; //arraylist

public class EDOmain {

myQ queue = new myQ();
ArrayList<EDOfiledata> filenameA = new ArrayList<EDOfiledata>(); //needed or use FTPFile[]?

//constructor
public EDOmain() {

}


public static void main(String[] args) {
        EDOclient myFTP = new EDOclient();    
        myFTP.start();
    }
}