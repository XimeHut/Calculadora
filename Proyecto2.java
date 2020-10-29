import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent; //para los botonoes

public class Proyecto2 extends JFrame implements ActionListener //JFrame es un objeto que estas utlizando dentro de java.swing , lo estamos heradando , se creo cuando le damos set visible y set size
{
			
			//Atributos, variables de clase o variables de instancia , todo son privados
			private JMenuBar mbPrincipal;
			private  JMenu menuCalculos, menuGrados;
			private	 JMenuItem miFactorial, miExponencial, miEcuacion , miGFGC, miGCGF, miSalir , miCalcu, miTabla;
			
			private EcuacionGUI4 ecuacion = new EcuacionGUI4(); // con esto se abre luego luego 
			private ExpoGUI4 exponencial = new ExpoGUI4();
			private GFGC grados = new GFGC();
			private GCGF grados1 = new GCGF ();
			private FactorialGUI4 factorial = new FactorialGUI4();
			private Calculadora2 calcu = new Calculadora2();
			private TablaGUI tabla = new TablaGUI();
			
			private JPanel panel;//este me va permiter manupular todos los panel2 de cada gui que quiera visualizar 
			
			
			//Contructor para inicilaizar estos atributos , prepara la aplicacion para correr
				
				public Proyecto2() //no se pone void ni nada por que no te regresa nada
				{
					//1.-Crear los objetos de los atributos
					//JMenuBar , es como file 
					//JMenu , si quieres desplegar algo
					//JMenuItem , para darle clik , siempre es que hacemos click , como un boton 
					
					mbPrincipal = new JMenuBar();
					menuCalculos = new JMenu("App Calculos"); //menuCalculos , pongo el nombre
					menuGrados = new JMenu ("Conversion de Grados"); //es menu por que se le va desplegar dos opciones
					miEcuacion = new JMenuItem ("Ecuacion Cuadratica");
					miFactorial = new JMenuItem ("Factorial de N");
					miExponencial = new JMenuItem ("Exponencial Y= B^x");
					miGCGF = new JMenuItem ("G. Centigrados -> G. Farenheit" );
					miGFGC = 	new JMenuItem ("G.Farenheit -> G. Centigrados");
					miCalcu = new JMenuItem ("Calculadora");
					miTabla= new JMenuItem ("Tabla de Multiplicar");
					miSalir = new JMenuItem ("Exit"); //tiene que ser JMeniItem
					panel= new JPanel();
					
					//Colocar .addActionListener(this) a los JMenuItmes para que se ejecuten los votones
					
					miSalir.addActionListener(this); //siempre se lo pone this,para decirle que es sobre ese objeto
					miEcuacion.addActionListener(this);
					miFactorial.addActionListener(this);
					miExponencial.addActionListener(this);
					miGCGF.addActionListener(this);
					miGFGC.addActionListener(this);
					miCalcu.addActionListener(this);
					miTabla.addActionListener(this);
					
				
			
					//2.-Colocar los JMenuItems en los JMenus correspondientes, poner el orden , aqui establecemos el orde
					
					menuGrados.add(miGCGF); //opciones de conversion  que saldran de menuGrados
					menuGrados.add(miGFGC);
					
					menuCalculos.add(miEcuacion);
					menuCalculos.add(miFactorial);
					menuCalculos.add(menuGrados);///// mbPrincipal.add(menuGrados) para que se ponga enfrente como file- edit 
					menuCalculos.add(miExponencial);
					menuCalculos.add (miCalcu);
					menuCalculos.add(miTabla);
					menuCalculos.add(miSalir);
					
					
					//Colocar en JMenuBar los JMenus correspondientes
					mbPrincipal.add(menuCalculos);
					
					//Adicionar el JFrame y hacerlo visible
					
					setJMenuBar(mbPrincipal);
					setSize (300,300);
					setVisible(true);
				}
				
				public void actionPerformed (ActionEvent event)//el nombre de alado es el que voy a comparar
			    {
			    	  if(event.getSource() == miEcuacion)
				        {
				          // new EcuacionGUI4();
				          //panel=ecuacion.panel2;// le estoy diciendo que panel apunte a la direccion de panel2 que ya existe en EcuacionGUI4, esto es con variables public 
				          panel.setVisible(false);
				          panel=ecuacion.getPanel2(); //mando a llamr a panel2 desde gets
				          panel.setVisible(true); //con respecto al panel 
				          add(panel); //
				          setVisible(true); // controlo cuando se vea  , con respecto a frame 
				        }
				        
				        if(event.getSource() == miFactorial)
				        {
				           //new FactorialGUI4();
				          panel.setVisible(false);
				          panel=factorial.getPanel2(); //mando a llamr a panel2 desde gets
				          panel.setVisible(true); //con respecto al panel 
				          add(panel); //
				          setVisible(true); // controlo cuando se vea  , con respecto a frame 
				        }
				      
				        if(event.getSource() == miGCGF)
				        {
				           //new  GCGF();
				          panel.setVisible(false);
				          panel=grados1.getPanel2(); //mando a llamr a panel2 desde gets
				          panel.setVisible(true); //con respecto al panel 
				          add(panel); //
				          setVisible(true); // controlo cuando se vea  , con respecto a frame 
				        }
				        
				       if (event.getSource() == miGFGC)
				        {
				           //new GFGC();
				          panel.setVisible(false);
				          panel=grados.getPanel2(); //mando a llamr a panel2 desde gets
				          panel.setVisible(true); //con respecto al panel 
				          add(panel); //
				          setVisible(true); // controlo cuando se vea  , con respecto a frame 
				        
				        }
				        
				          if(event.getSource() == miExponencial)
				        {
				           //new ExpoGUI4();
				           panel.setVisible(false);
				          panel=exponencial.getPanel2(); //mando a llamr a panel2 desde gets
				          panel.setVisible(true); //con respecto al panel 
				          add(panel); //
				          setVisible(true); // controlo cuando se vea  , con respecto a frame 
				        
				        }
				        
				          if(event.getSource() == miCalcu)
				        {
				           //new ExpoGUI4();
				           panel.setVisible(false);
				          panel=calcu.getPanel4(); //mando a llamr a panel2 desde gets
				          panel.setVisible(true); //con respecto al panel 
				          add(panel); //
				          setVisible(true); // controlo cuando se vea  , con respecto a frame 
				        
				        }
				        
				          if(event.getSource() == miTabla)
				        {
				           
				          panel.setVisible(false);
				          panel=tabla.getPanel2(); //mando a llamr a panel2 desde gets
				          panel.setVisible(true); //con respecto al panel 
				          add(panel); //
				          setVisible(true); // controlo cuando se vea  , con respecto a frame 
				        
				        }
				        
				        
				        
				        
					 if(event.getSource() == miSalir)
				        {
				            System.exit(0);
				        }
				}
				
				
		
			
			public static void main(String args[])
			{
				new Proyecto2();
			}
				
		}
