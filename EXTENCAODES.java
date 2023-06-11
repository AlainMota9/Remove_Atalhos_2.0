
/** 
 * @author Alain Louzeiro Mota
 * @version 1.0 
 */

package PROTECAO;

import java.io.IOException;
import javax.swing.JOptionPane;

public class EXTENCAODES{
    
 private static String pendrive = "";      
        
   public EXTENCAODES(){//Construtor 
            
}
   

public void PENA(){
    pendrive = "A";
    EXTENCAODES.Unidade();
}

public void PENB(){
    pendrive = "B";
    EXTENCAODES.Unidade();
}

public void PEND(){
    pendrive = "D";
    EXTENCAODES.Unidade();
}

public void PENE(){
    pendrive = "E";
    EXTENCAODES.Unidade();
}

public void PENF(){
    pendrive = "F";
    EXTENCAODES.Unidade();
}

public void PENG(){
    pendrive = "G";
    EXTENCAODES.Unidade();
}

public void PENH(){
    pendrive = "H";
    EXTENCAODES.Unidade();
}

public void PENI(){
    pendrive = "I";
    EXTENCAODES.Unidade();
}

public void PENJ(){
    pendrive = "J";
    EXTENCAODES.Unidade();
}

public void PENK(){
    pendrive = "K";
    EXTENCAODES.Unidade();
}

public void PENL(){
    pendrive = "L";
    EXTENCAODES.Unidade();
}

public void PENM(){
    pendrive = "M";
    EXTENCAODES.Unidade();
}

public void PENN(){
    pendrive = "N";
    EXTENCAODES.Unidade();
}

public void PENO(){
    pendrive = "O";
    EXTENCAODES.Unidade();
}

public void PENP(){
    pendrive = "P";
    EXTENCAODES.Unidade();
}

public void PENQ(){
    pendrive = "Q";
    EXTENCAODES.Unidade();
}

public void PENR(){
    pendrive = "R";
    EXTENCAODES.Unidade();
}

public void PENS(){
    pendrive = "S";
    EXTENCAODES.Unidade();
}

public void PENT(){
    pendrive = "T";
    EXTENCAODES.Unidade();
}

public void PENU(){
    pendrive = "U";
    EXTENCAODES.Unidade();
}

public void PENV(){
    pendrive = "V";
    EXTENCAODES.Unidade();
}

public void PENX(){
    pendrive = "X";
    EXTENCAODES.Unidade();
}

public void PENW(){
    pendrive = "W";
    EXTENCAODES.Unidade();
}

public void PENY(){
    pendrive = "Y";
    EXTENCAODES.Unidade();
}

public void PENZ(){
    pendrive = "Z";
    EXTENCAODES.Unidade();
}


private static void Unidade (){
String TASKKILL = "/IM cscript.exe /T /F";//Cancela a execução do processo cria atalho (vírus)

String TAKEOWN1 = "/f \"/" + pendrive + ":\\*.*\"";//Concede como Proprietário o Administrador (Administrador)
   
//Volta a conceder o Controle total a todos os usuários
String ICACLSA1 = "\"" + pendrive + ":\\*.*\" /grant \"SISTEMA\":(OI)(CI)F";
String ICACLSA2 = "\"" + pendrive + ":\\*.*\" /grant \"Administradores\":(OI)(CI)F";
String ICACLSA3 = "\"" + pendrive + ":\\*.*\" /grant \"Usuários autenticados\":(OI)(CI)F";
String ICACLSA4 = "\"" + pendrive + ":\\*.*\" /grant \"Usuários\":(OI)(CI)F";
String ICACLSA5 = "\"" + pendrive + ":\\*.*\" /grant \"Todos\":(OI)(CI)F";

String ATTRIB1 = "attrib -R -h -s \"" + pendrive + ":\\*.*\" /S /D /L";
         
String DEL1 = "del /Q \"" + pendrive + ":\\*.lnk\"";
String DEL2 = "del /Q \"" + pendrive + ":\\*.vbs\"";
String DEL3 = "del /Q \"" + pendrive + ":\\*.js\"";
String DEL4 = "del /Q \"" + pendrive + ":\\*.db\"";
String DEL5 = "del /Q \"" + pendrive + ":\\*.inf\"";

String MOVE1 = "MOVE /Y \"" + pendrive + ":\\.Trashes\\*.*\" " + "\"" + pendrive + ":\"";
String MOVE2 = "MOVE /Y \"" + pendrive + ":\\.Trashes\" " + "\"" + pendrive + ":\\ARQUIVOS RECUPERADOS\"";           

String MOVE3 = "MOVE /Y \"" + pendrive + ":\\Trashes\\*.*\" " + "\"" + pendrive + ":\"";
String MOVE4 = "MOVE /Y \"" + pendrive + ":\\Trashes\" " + "\"" + pendrive + ":\\ARQUIVOS RECUPERADOS\"";           

String MOVE5 = "MOVE /Y \"" + pendrive + ":\\.Dtrashes\\*.*\" " + "\"" + pendrive + ":\"";
String MOVE6 = "MOVE /Y \"" + pendrive + ":\\.Dtrashes\" " + "\"" + pendrive + ":\\ARQUIVOS RECUPERADOS\"";           

String MOVE7 = "MOVE /Y \"" + pendrive + ":\\RECYCLER\\*.*\" " + "\"" + pendrive + ":\"";
String MOVE8 = "MOVE /Y \"" + pendrive + ":\\RECYCLER\" " + "\"" + pendrive + ":\\ARQUIVOS RECUPERADOS\""; 

String ATTRIB2 = "attrib +h \"" + pendrive + ":\\ARQUIVOS RECUPERADOS\\System Volume Information\" /S /D";

String ATTRIB3 = "attrib +h \"" + pendrive + ":\\System Volume Information\" /S /D";

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\taskkill.exe "+ TASKKILL);
} catch (IOException ex) { 
ex.printStackTrace(); 
 } 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\takeown.exe "+ TAKEOWN1);
} catch (IOException ex) {
 ex.printStackTrace(); 
 } 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLSA1);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLSA2);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLSA3);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLSA4);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("C:\\Windows\\system32\\icacls.exe "+ ICACLSA5);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("cmd /c "+ ATTRIB1);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("cmd /c "+ DEL1);
} catch (IOException ex) {   
 ex.printStackTrace();    
}

try {   
Runtime.getRuntime().exec("cmd /c "+ DEL2);
} catch (IOException ex) {   
 ex.printStackTrace();    
}

try {   
Runtime.getRuntime().exec("cmd /c "+ DEL3);
} catch (IOException ex) {   
 ex.printStackTrace();    
}

try {   
Runtime.getRuntime().exec("cmd /c "+ DEL4);
} catch (IOException ex) {   
 ex.printStackTrace();    
}

try {   
Runtime.getRuntime().exec("cmd /c "+ DEL5);
} catch (IOException ex) {   
 ex.printStackTrace();    
}
try {   
Runtime.getRuntime().exec("cmd /c "+ MOVE1);
} catch (IOException ex) {   
 ex.printStackTrace();    
}

try {   
Runtime.getRuntime().exec("cmd /c "+ MOVE2);
} catch (IOException ex) {   
 ex.printStackTrace();    
}

try {   
Runtime.getRuntime().exec("cmd /c "+ MOVE3);
} catch (IOException ex) {   
 ex.printStackTrace();    
}

try {   
Runtime.getRuntime().exec("cmd /c "+ MOVE4);
} catch (IOException ex) {   
 ex.printStackTrace();    
}

try {   
Runtime.getRuntime().exec("cmd /c "+ MOVE5);
} catch (IOException ex) {   
 ex.printStackTrace();    
}

try {   
Runtime.getRuntime().exec("cmd /c "+ MOVE6);
} catch (IOException ex) {   
 ex.printStackTrace();    
}

try {   
Runtime.getRuntime().exec("cmd /c "+ MOVE7);
} catch (IOException ex) {   
 ex.printStackTrace();    
}

try {   
Runtime.getRuntime().exec("cmd /c "+ MOVE8);
} catch (IOException ex) {   
 ex.printStackTrace();    
}

try {   
Runtime.getRuntime().exec("cmd /c "+ ATTRIB2);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

try {   
Runtime.getRuntime().exec("cmd /c "+ ATTRIB3);
} catch (IOException ex) {   
 ex.printStackTrace();    
} 

JOptionPane.showMessageDialog(null, "Atalhos removidos! Seus arquivos estão na pasta ARQUIVOS RECUPERADOS.");
System.exit(0);

}//FIM DO MÉTODO DESISTALAÇÃO

}//Fim da classe



