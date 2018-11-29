package notas;
import java.awt.Color;
import java.awt.Graphics;


public class Grafica extends javax.swing.JFrame {
float numero, resto, nota;
int opcion;

public Grafica() {
initComponents();
this.setResizable(false);
this.setLocationRelativeTo(null);
Ocultar();
numero = Interfaz.resultado;
resto = Interfaz.resto;
opcion = Interfaz.opciones;
Emojis();
Mensaje();
//this.setType(Type.UTILITY); // Hacemos que la ventana sea la que solo tiene el boton cerrar.
}

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_Mensaje = new javax.swing.JTextArea();
        lbl_Emoji1 = new javax.swing.JLabel();
        lbl_Emoji2 = new javax.swing.JLabel();
        lbl_Emoji3 = new javax.swing.JLabel();
        lbl_Emoji4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txt_Mensaje.setEditable(false);
        txt_Mensaje.setColumns(14);
        txt_Mensaje.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txt_Mensaje.setRows(4);
        txt_Mensaje.setTabSize(16);
        txt_Mensaje.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_Mensaje.setEnabled(false);
        jScrollPane1.setViewportView(txt_Mensaje);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 310, 220));

        lbl_Emoji1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/emoji1.png"))); // NOI18N
        getContentPane().add(lbl_Emoji1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 120));

        lbl_Emoji2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/emoji2.png"))); // NOI18N
        getContentPane().add(lbl_Emoji2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 106, -1));

        lbl_Emoji3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/emoji3.png"))); // NOI18N
        getContentPane().add(lbl_Emoji3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 100, 100));

        lbl_Emoji4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/emoji4.png"))); // NOI18N
        getContentPane().add(lbl_Emoji4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 110, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

// Creamos el metodo reservado para la Libreria Graphics.
@Override
public void paint(Graphics g){
super.paint(g); // El metodo de la clase padre para comenzar a dibujar con el elemento graphics que hemos creado.

try{
float ganado, restante;
int p_ganado, p_restante; 
ganado = 100-resto;
restante = resto;
p_ganado = (int)(100-resto);
p_restante = (int)resto;

    
// Porcentaje ganado
g.setColor(new Color(0,133,0));
g.fillRect(20, 180, p_ganado*3, 20);
g.fillRect(20, 210, 12, 12);
g.setColor(Color.WHITE);
g.drawString(ganado + "%", 25, 193);
g.setColor(Color.BLACK);
g.drawString("Porcentaje ganado", 35, 220);


if(p_ganado==100){
    
}else{
// Porcentaje a ganar
g.setColor(new Color(255,0,0));
g.fillRect(20+p_ganado*3, 180, p_restante*3, 20);
g.fillRect(20, 230, 12, 12);
g.setColor(Color.WHITE);
g.drawString(restante + "%", 25+p_ganado*3, 193);  
g.setColor(Color.BLACK);
g.drawString("Porcentaje faltante", 35, 240);
}


}catch(Exception e){}
}
       

public void Ocultar(){
lbl_Emoji1.setVisible(false);
lbl_Emoji2.setVisible(false);
lbl_Emoji3.setVisible(false);
lbl_Emoji4.setVisible(false);
}
    
public void Emojis(){

switch(opcion){
case(1):
Ocultar();
lbl_Emoji1.setVisible(true);
break;
case(2):
Ocultar();
lbl_Emoji2.setVisible(true);
break;
case(3):
Ocultar();
lbl_Emoji3.setVisible(true);
break;
case(4):
Ocultar();
lbl_Emoji4.setVisible(true);
break;
}

}

public void Mensaje(){
if(numero==0){
nota = Interfaz.notatotal;    

if(nota>=0 && nota<3){
txt_Mensaje.setText("Lastimosamente," + 
                    "\nperdiste con una" +
                    "\nmala nota");
}else if(nota>=3 && nota<3.5){
txt_Mensaje.setText("Felicidades," + 
                    "\nganaste con una" +
                    "\nnota regular");
}else if(nota>=3.5 && nota<4){
txt_Mensaje.setText("Excelente!!!," + 
                    "\nganaste con una" +
                    "\nbuena nota");
}else{
txt_Mensaje.setText("El puto amo!!!," + 
                    "\nganaste con una" +
                    "\nnota super excelente");
}

}else{
 
txt_Mensaje.setText("Te hace falta sacar:" + 
                    "\n" + numero + " en el " + resto + "%" +
                    "\nrestante para coronar!");
    
    
}
}




public static void main(String args[]) {

try {
for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
if ("Nimbus".equals(info.getName())) {
javax.swing.UIManager.setLookAndFeel(info.getClassName());
break;
}
}
} catch (ClassNotFoundException ex) {
java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (InstantiationException ex) {
java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (IllegalAccessException ex) {
java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (javax.swing.UnsupportedLookAndFeelException ex) {
java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}


java.awt.EventQueue.invokeLater(new Runnable() {
public void run() {
new Grafica().setVisible(true);
}
        });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Emoji1;
    private javax.swing.JLabel lbl_Emoji2;
    private javax.swing.JLabel lbl_Emoji3;
    private javax.swing.JLabel lbl_Emoji4;
    private javax.swing.JTextArea txt_Mensaje;
    // End of variables declaration//GEN-END:variables
}
