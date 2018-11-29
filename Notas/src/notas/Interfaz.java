package notas;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.DecimalFormat;
import org.jvnet.substance.SubstanceLookAndFeel;

/**
Proyecto: Que nota necesito?

Descripcion: Ingresar las notas recolectadas para calcular la nota final que se debe obtener para "ganar" la materia,
con la minima nota de aprobacion (3.0)

Dependencias: Ninguna
Autor: Antonio Gonzalez Restrepo
Skin: 
Fecha: 03/11/2018
*/

public class Interfaz extends javax.swing.JFrame {
DefaultTableModel dtm = new DefaultTableModel(){
 
@Override
public boolean isCellEditable(int rowIndex,int columnIndex){
return false;
}};// Creamos el estilo de la tabla
String titulos[] = {"Nota","Porcentaje"};
public static float resultado = 0;
public static float resto = 0;
public static float notatotal = 0;
public static int opciones = 0;

public Interfaz() {
initComponents();
this.setLocationRelativeTo(null);
this.setResizable(false);
dtm.setColumnIdentifiers(titulos);
tbl_Notas.setModel(dtm);
}

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Notas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txt_Nota = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_Porcentaje = new javax.swing.JTextField();
        btn_Agregar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        btn_Todo = new javax.swing.JButton();
        btn_Calcular = new javax.swing.JButton();
        btn_Informacion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("Que nota necesito?");

        tbl_Notas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_Notas);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Nota:");

        txt_Nota.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_Nota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_NotaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_NotaKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Porcentaje:");

        txt_Porcentaje.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_Porcentaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PorcentajeKeyTyped(evt);
            }
        });

        btn_Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/signo.png"))); // NOI18N
        btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarActionPerformed(evt);
            }
        });

        btn_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/signo2.png"))); // NOI18N
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });

        btn_Todo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/signo3.png"))); // NOI18N
        btn_Todo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TodoActionPerformed(evt);
            }
        });

        btn_Calcular.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        btn_Calcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/v3.png"))); // NOI18N
        btn_Calcular.setText("CALCULAR NOTA");
        btn_Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CalcularActionPerformed(evt);
            }
        });

        btn_Informacion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_Informacion.setText("?");
        btn_Informacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InformacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Informacion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_Nota, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_Porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_Agregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_Eliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_Todo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(52, 52, 52)
                                .addComponent(jLabel2)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_Informacion)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_Nota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_Agregar)
                                    .addComponent(btn_Eliminar)
                                    .addComponent(btn_Todo))))
                        .addGap(18, 18, 18)
                        .addComponent(btn_Calcular)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed

    if(txt_Nota.getText().equals("") || txt_Porcentaje.getText().equals("")){
    JOptionPane.showMessageDialog(null, "Rellene todos los campos!", "Error:", JOptionPane.ERROR_MESSAGE);
    txt_Nota.setText("");
    txt_Porcentaje.setText("");
    }else{
      
    float notas = Float.parseFloat(txt_Nota.getText());
    float porcentaje = Float.parseFloat(txt_Porcentaje.getText());    
       
    if(notas<0 || notas>5){
    JOptionPane.showMessageDialog(null, "Notas permitidas (0.0 - 5.0)", "Advertencia:", JOptionPane.WARNING_MESSAGE); 
    txt_Nota.setText("");
    }else if(porcentaje<1 || porcentaje>100){
    JOptionPane.showMessageDialog(null, "Porcentaje permitido (1% - 100%)", "Advertencia:", JOptionPane.WARNING_MESSAGE); 
    txt_Porcentaje.setText("");
    }else{
    Agregar();
    }   
        
    }    
    }//GEN-LAST:event_btn_AgregarActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
    Eliminar();
    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void btn_TodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TodoActionPerformed
    EliminarTodo();
    }//GEN-LAST:event_btn_TodoActionPerformed

    private void txt_NotaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_NotaKeyPressed
   
    }//GEN-LAST:event_txt_NotaKeyPressed

    private void btn_CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CalcularActionPerformed

    if(dtm.getRowCount()==0){
    JOptionPane.showMessageDialog(null, "No hay nada para calcular!", "Advertencia:", JOptionPane.WARNING_MESSAGE); 
    }else{
    Calcular();    
    }
    
    }//GEN-LAST:event_btn_CalcularActionPerformed

    private void txt_NotaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_NotaKeyTyped
    int validar = (int)evt.getKeyChar(); // De char pasamos a int para tenenerlo en ASCII.
    
    if(validar==46 || validar>=48 && validar<=57 || validar==8){
       
    }else{
    getToolkit().beep();
    evt.consume();
    JOptionPane.showMessageDialog(null, "Solo numeros y el punto!", "Informacion:", JOptionPane.INFORMATION_MESSAGE);
    txt_Nota.setText("");
    }    
    }//GEN-LAST:event_txt_NotaKeyTyped

    private void txt_PorcentajeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PorcentajeKeyTyped
    int validar = (int)evt.getKeyChar();
    
    if(validar==46 || validar==8 || validar>=48 && validar<=57){
     
    }else{
    getToolkit().beep();
    evt.consume();
    JOptionPane.showMessageDialog(null, "Solo numeros y el punto!", "Informacion:", JOptionPane.INFORMATION_MESSAGE);
    txt_Porcentaje.setText("");
    }
    
    
    }//GEN-LAST:event_txt_PorcentajeKeyTyped

    private void btn_InformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InformacionActionPerformed
    JOptionPane.showMessageDialog(null, "Autor: Antonio Gonzalez Restrepo \nFecha: 03/11/2018", "Informacion:", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_InformacionActionPerformed
   
    
    
    public void Agregar(){
    float notas = Float.parseFloat(txt_Nota.getText());
    float porcentaje = Float.parseFloat(txt_Porcentaje.getText());
    
    Object datos[] = {notas, porcentaje};//+ "%"};
    dtm.addRow(datos);   
    }
    
    
    
    
    public void Eliminar(){
    
    try{
    if(dtm.getRowCount()==0){
    JOptionPane.showMessageDialog(null, "No hay ningun elemento en la tabla!", "Error:", JOptionPane.ERROR_MESSAGE);    
    }else{
    dtm.removeRow(tbl_Notas.getSelectedRow());
    }    
    }catch(ArrayIndexOutOfBoundsException e){
    JOptionPane.showMessageDialog(null, "Seleccione un elemento de la tabla!", "Advertencia:", JOptionPane.WARNING_MESSAGE);    
    }
    }
    
    
    
    public void EliminarTodo(){
    if(dtm.getRowCount()==0){
    JOptionPane.showMessageDialog(null, "No hay ningun elemento en la tabla!", "Error:", JOptionPane.ERROR_MESSAGE);    
    }else{
     
    while(dtm.getRowCount()!=0){
    tbl_Notas.selectAll();
    dtm.removeRow(tbl_Notas.getSelectedRow());
    }
    }
    }
    
    
    
    public void Calcular(){
    float datos[][] = new float[dtm.getRowCount()][2];
    float porcentaje = 0, notaminima = 3;
    
    
    for(int a = 0; a < datos.length; a++){
    for(int b = 0; b < datos[a].length; b++){
    datos[a][b] = Float.parseFloat(String.valueOf(tbl_Notas.getValueAt(a, b)));
    }   
    }
    
    for(int a = 0; a < datos.length; a++){
    porcentaje += datos[a][1];
    }

    if(porcentaje>100){
    JOptionPane.showMessageDialog(null, "La suma de los porcentajes no puede ser mayor a 100%", "Error:", JOptionPane.ERROR_MESSAGE);
    }else{
    
    if(porcentaje==100){
    resultado = 0;
    resto = 0;
    
    float sumatotal= 0;
    for(int a = 0; a < datos.length; a++){
    sumatotal += datos[a][0]*(datos[a][1]/100);
    }
    
    if(sumatotal>=0 && sumatotal<3){
    opciones = 4;
    }else if(sumatotal>=3 && sumatotal<3.5){
    opciones = 3;
    }else if(sumatotal>=3.5 && sumatotal<4){
    opciones = 2;
    }else{
    opciones = 1;
    }
    
    notatotal = sumatotal;
    
    }else{
    float restante = 0;
    float suma = 0;
    
    restante = 100 - porcentaje;
        
    for(int a = 0; a < datos.length; a++){
    suma += datos[a][0]*(datos[a][1]/100);
    }
    
    DecimalFormat df = new DecimalFormat("#.00");
    float temporal = (notaminima-suma)/(restante/100);
    resultado = Float.parseFloat(df.format(temporal));
    resto = restante;
    
    //JOptionPane.showMessageDialog(null, "Nota a sacar para aprobar: " + resultado + " en el " + restante + "%", "Informacion:", JOptionPane.INFORMATION_MESSAGE);
        
    
    if(resultado <= 1){
    opciones = 1;   
    }else if(resultado>1 && resultado<=3){
    opciones = 2;   
    }else if(resultado>2 && resultado<=5){
    opciones = 3;   
    }else{
    opciones = 4;    
    }  
    }
     
    Grafica grafica = new Grafica();
    grafica.setVisible(true);
    
    }
    }
    


    
public static void main(String args[]) {

try{
//JFrame.setDefaultLookAndFeelDecorated(true);
SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.CremeSkin");
}catch(Exception e){
JOptionPane.showMessageDialog(null, "No se ha podido cargar la skin!", "Error:", JOptionPane.ERROR_MESSAGE);    
}


java.awt.EventQueue.invokeLater(new Runnable() {
public void run() {
new Interfaz().setVisible(true);
}
});
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Calcular;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Informacion;
    private javax.swing.JButton btn_Todo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_Notas;
    private javax.swing.JTextField txt_Nota;
    private javax.swing.JTextField txt_Porcentaje;
    // End of variables declaration//GEN-END:variables
}
