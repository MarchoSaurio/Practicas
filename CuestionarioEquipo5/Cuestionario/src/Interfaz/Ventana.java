package Interfaz;

import TDA.Almacenar;
import TDA.Graficas;
import TDA.Preguntas;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Ventana extends JFrame implements ActionListener {

    private JButton sig, ant, res, ev, grafica;
    private Graficas graf;
    private JLabel etq1, etq2, etqImg;
    private ImageIcon img;
    private JRadioButton a, b, c, d;
    private ButtonGroup gRBtn;
    private Almacenar array;
    private Preguntas preg;
    private int i = 0, resp = 0, cont = 0;
    private int[] arrRes = {4, 3, 1, 2, 2, 2, 1, 2, 2, 1};
    private int[] corr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    public Ventana() {
        array = new Almacenar();
        preg = new Preguntas();
        setTitle("E-V-A-L-U-A-C-I-O-N");
        inicio();
        setBounds(100, 50, 800, 600);
        setLayout(null);
        getContentPane().setBackground(Color.CYAN);
        setLocationRelativeTo(null);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    public void inicio() {

        llenarArray("¿Qué significa AWT?", "Abstract Window Toolkit", " A) Abstract Window Talkit", " B) Abstract Window Too", " C) Abstract Window Tolkit", " D) Abstract Window Toolkit", "src/Imagenes/atw.png");

        llenarArray("¿Cuáles son las 3 fases de propagación de eventos?", "Captura, objetiva y propagación", " A) Objetiva, propagación y captura", " B) Propagación, elemento y captura", " C) Captura, objetiva y propagación", " D) Captura, Interno y Acción", "src/Imagenes/propragacionEventos.jpg");

        llenarArray("¿Cuál de estos es un evento?", "ItemEvent", " A) ItemEvent", " B) TextComponent", " C) List", " D) CreepEvent", "src/Imagenes/itemEvent.png");

        llenarArray("¿Qué es un evento?", "Una Interfaz", " A) Una clase", " B) Una interfaz", " C) Un tipo de dato", " D) Un metodo", "src/Imagenes/interfaz.png");

        llenarArray("El común denominador de más bajo nivel se acerca a…", "Raton y teclado", " A) Monitor y altavoces", " B) Ratón y teclado", " C) CPU y RAM", " D) Trackpad", "src/Imagenes/TecladoYRaton.jpg");

        llenarArray("Proporciona un conjunto limitado de componentes de GUI", "Applet", " A) Swing", " B) Applet", " C) AWT", " D) Scanner", "src/Imagenes/applet.jpg");

        llenarArray("¿ La clase java.awt.event es una subclase de AWT?", "Verdadero", "Verdadero", "Falso", "", "", "src/Imagenes/JavaAWT.jpg");

        llenarArray("Los eventos no se dividen en: Eventos de bajo nivel y Semanticos", "Falso", "Verdadero", "Falso", "", "", "src/Imagenes/Eventos en java.jpg");

        llenarArray("En una buena práctica de programación es preferible evitar el uso de contenedores al momento de usar componentes", "Falso", "Verdadero", "Falso", "", "", "src/Imagenes/Contenedores.gif");

        llenarArray("Swing es una biblioteca de GUI más moderna y potente que AWT", "Verdadero", "Verdadero", "Falso", "", "", "src/Imagenes/Swings.png");

        etq1 = new JLabel((i + 1) + ") " + array.devPregunta(0));
        etq1.setBounds(20, 20, 750, 15);
        add(etq1);

        a = new JRadioButton(array.devA(0));
        a.setBounds(20, 50, 250, 15);
        a.addActionListener(this);
        add(a);

        b = new JRadioButton(array.devB(0));
        b.setBounds(20, 70, 250, 15);
        b.addActionListener(this);
        add(b);

        c = new JRadioButton(array.devC(0));
        c.setBounds(20, 90, 250, 15);
        c.addActionListener(this);
        add(c);

        d = new JRadioButton(array.devD(0));
        d.setBounds(20, 110, 250, 15);
        d.addActionListener(this);
        add(d);

        gRBtn = new ButtonGroup();
        gRBtn.add(a);
        gRBtn.add(b);
        gRBtn.add(c);
        gRBtn.add(d);

        img = new ImageIcon(array.devRuta(0));

        etqImg = new JLabel();
        etqImg.setBounds(150, 100, 540, 370);
        etqImg.setAlignmentX(CENTER_ALIGNMENT);
        etqImg.setAlignmentY(CENTER_ALIGNMENT);
        etqImg.setIcon(img);
        add(etqImg);

        ant = new JButton("Anterior");
        ant.setBounds(50, 500, 90, 40);
        ant.addActionListener(this);
        //add(ant);

        sig = new JButton("Siguiente");
        sig.setBounds(30, 500, 200, 40);
        sig.addActionListener(this);
        add(sig);

//        res = new JButton("Checar");
//        res.setBounds(50, 500, 200, 40);
//        res.addActionListener(this);
//        add(res);

        ev = new JButton("Resultados");
        ev.setBounds(550, 500, 200, 40);
        ev.addActionListener(this);
        add(ev);

        etq2 = new JLabel("");
        etq2.setBounds(350, 500, 300, 40);
        etq2.setVisible(true);
        add(etq2);

        if (i == 0) {
            ant.setEnabled(false);
        } else {
            ant.setEnabled(true);
        }
    }

    public void llenarArray(String pregun, String resp, String ax, String bx, String cx, String dx, String route) {
        preg = new Preguntas(pregun, resp, ax, bx, cx, dx, route);
        array.añadirPreg(preg);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sig) {
            
            if (resp == arrRes[i]) {
                etq2.setText(" CORRECTO ");
                corr[i] = 1;
            } else {
                etq2.setText(" INCORRECTO ");
            }
            
            i++;
            etq1.setText((i + 1) + ") " + array.devPregunta(i));
            a.setText(array.devA(i));
            b.setText(array.devB(i));
            c.setText(array.devC(i));
            d.setText(array.devD(i));

            img = new ImageIcon(array.devRuta(i));
            etqImg.setIcon(img);

            gRBtn.clearSelection();

            if (array.devC(i) == "" && array.devD(i) == "") {
                c.setVisible(false);
                d.setVisible(false);
            } else {
                c.setVisible(true);
                d.setVisible(true);
            }

            if (i == 9) {
                sig.setEnabled(false);
                sig.setVisible(false);
                ev.setVisible(true);
            }

            if (i == 0) {
                ant.setEnabled(false);
            } else {
                ant.setEnabled(true);
            }
            

            //System.out.println("Si");
        }

        if (e.getSource() == ant) {
            i--;

            etq1.setText((i + 1) + ") " + array.devPregunta(i));
            a.setText(array.devA(i));
            b.setText(array.devB(i));
            c.setText(array.devC(i));
            d.setText(array.devD(i));
            sig.setVisible(true);
            ev.setVisible(false);
            sig.setEnabled(true);

            img = new ImageIcon(array.devRuta(i));
            etqImg.setIcon(img);

            gRBtn.clearSelection();

            if (array.devC(i) == "" && array.devD(i) == "") {
                c.setVisible(false);
                d.setVisible(false);
            } else {
                c.setVisible(true);
                d.setVisible(true);
            }

            if (i == 0) {
                ant.setEnabled(false);
            } else {
                ant.setEnabled(true);
            }

        }

        if (e.getSource() == a) {
            resp = 1;
        }
        if (e.getSource() == b) {
            resp = 2;
        }
        if (e.getSource() == c) {
            resp = 3;
        }
        if (e.getSource() == d) {
            resp = 4;
        }

        if (e.getSource() == res) {
            System.out.println("XD");
        }

        if (e.getSource() == ev) {
            for (i = 0; i <= 9; i++) {
                cont += corr[i];
            }
            JOptionPane.showMessageDialog(null, "Obtuviste " + cont * 100 / 10 + "%" + " De 100");

            ev.setEnabled(false);
            ev.setVisible(false);

            grafica = new JButton("Grafico");
            grafica.setBounds(600, 500, 140, 40);
            grafica.addActionListener(this);
            add(grafica);
        }

        if (e.getSource() == grafica) {
            graf = new Graficas();

            graf.graficaBarras3D(graf.grafEval(cont, (10 - cont)));
        }

    }

}
