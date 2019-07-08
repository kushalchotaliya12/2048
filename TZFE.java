
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TZFE extends Frame implements ActionListener{

    Label[][] l = new Label[4][4];
    Button b1 = new Button("UP");
    Button b2 = new Button("DOWN");
    Button b3 = new Button("LEFT");
    Button b4 = new Button("RIGHT");
    Font font = new Font("Verdana", Font.BOLD, 26);
    GridLayout gl = new GridLayout(5, 5, 5, 5);

    TZFE() {
        int i, j;
        setLayout(gl);
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {

                l[i][j] = new Label();
                l[i][j].setAlignment(1);
                l[i][j].setBackground(Color.white);
                l[i][j].setFont(font);
                add(l[i][j]);
            }
        }
        l[1][0].setText("2");l[2][0].setText("2");
        l[3][0].setText("2048");l[0][0].setText("");
        l[3][3].setText("4");

        b1.setBackground(Color.green);  b1.setFont(font);
        b2.setBackground(Color.green);  b2.setFont(font);
        b3.setBackground(Color.green);  b3.setFont(font);
        b4.setBackground(Color.green);  b4.setFont(font);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        setSize(520, 520);
        setBackground(Color.black);
        show();
    }

    public static void main(String[] args) {
        TZFE ob = new TZFE();
    }
int p = 0,q=0;
int te = 0;
    @Override
    public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        if (e.getSource() == b1) 
        {
            for (int k = 0; k < 4; k++) 
            {
                int u=0,v=0,w=0,z=0;
                if (l[1][k].getText().equals("") && l[2][k].getText().equals("")) 
                {   
                        if (l[0][k].getText().equals("")) 
                        {
                            l[0][k].setText(l[3][k].getText());
                        } 
                        else if (l[0][k].getText().equals(l[3][k].getText())) 
                        {
                            
                            u = Integer.parseInt(l[0][k].getText());
                            v = Integer.parseInt(l[3][k].getText());
                            l[0][k].setText((u+v)+"");
                        }
                        else
                        {
                            l[1][k].setText(l[3][k].getText());
                        }
                    l[3][k].setText("");
                }
                else if(l[3][k].getText().equals("") && l[2][k].getText().equals(""))
                {
                    if (l[0][k].getText().equals("")) 
                        {
                            l[0][k].setText(l[1][k].getText());
                            l[1][k].setText("");
                        } 
                        else if (l[0][k].getText().equals(l[1][k].getText())) 
                        {                            
                            u = Integer.parseInt(l[0][k].getText());
                            v = Integer.parseInt(l[1][k].getText());
                            l[0][k].setText((u+v)+"");
                            l[1][k].setText("");
                        }                                      
                }
                else if(l[3][k].getText().equals("") && l[1][k].getText().equals(""))
                {
                    if (l[0][k].getText().equals("")) 
                        {
                            l[0][k].setText(l[2][k].getText());
                        } 
                        else if (l[0][k].getText().equals(l[2][k].getText())) 
                        {                            
                            u = Integer.parseInt(l[0][k].getText());
                            v = Integer.parseInt(l[2][k].getText());
                            l[0][k].setText((u+v)+"");
                        }                                      
                        else
                        {
                            l[1][k].setText(l[2][k].getText());
                        }                    
                    l[2][k].setText("");
                }
                else if(l[3][k].getText().equals(""))
                {
                    if(l[0][k].getText().equals(""))
                    {
                        if(l[1][k].getText().equals(l[2][k].getText()))
                        {
                            u = Integer.parseInt(l[1][k].getText());
                            v = Integer.parseInt(l[2][k].getText());
                            l[0][k].setText((u+v)+"");
                            l[1][k].setText("");
                            l[2][k].setText("");
                        }
                        else
                        {
                            l[0][k].setText(l[1][k].getText());
                            l[1][k].setText(l[2][k].getText());
                            l[2][k].setText("");
                        }
                    }
                    else
                    {
                        if(l[0][k].getText().equals(l[1][k].getText()))
                        {
                            u = Integer.parseInt(l[0][k].getText());
                            v = Integer.parseInt(l[1][k].getText());
                            l[0][k].setText(""+(u+v));
                            l[1][k].setText(l[2][k].getText());
                            l[2][k].setText("");
                        }
                        else if(l[1][k].getText().equals(l[2][k].getText()))
                        {
                            u = Integer.parseInt(l[1][k].getText());
                            v = Integer.parseInt(l[2][k].getText());
                            l[1][k].setText(""+(u+v));
                            l[2][k].setText("");
                        }
                    }
                }
                else if(l[2][k].getText().equals(""))
                {
                    if(l[0][k].getText().equals(""))
                    {
                        if(l[1][k].getText().equals(l[3][k].getText()))
                        {
                            u = Integer.parseInt(l[1][k].getText());
                            v = Integer.parseInt(l[3][k].getText());
                            l[0][k].setText((u+v)+"");
                            l[1][k].setText("");
                            l[3][k].setText("");
                        }
                        else
                        {
                            l[0][k].setText(l[1][k].getText());
                            l[1][k].setText(l[3][k].getText());
                            l[3][k].setText("");
                        }
                    }
                    else
                    {
                        if(l[0][k].getText().equals(l[1][k].getText()))
                        {
                            u = Integer.parseInt(l[0][k].getText());
                            v = Integer.parseInt(l[1][k].getText());
                            l[0][k].setText(""+(u+v));
                            l[1][k].setText(l[3][k].getText());
                            l[3][k].setText("");
                        }
                        else if(l[1][k].getText().equals(l[3][k].getText()))
                        {
                            u = Integer.parseInt(l[1][k].getText());
                            v = Integer.parseInt(l[3][k].getText());
                            l[1][k].setText(""+(u+v));
                            l[3][k].setText("");
                        }
                        else
                        {
                            l[2][k].setText(l[3][k].getText());
                            l[3][k].setText("");
                        }
                    }
                }
                else if(l[1][k].getText().equals(""))
                {
                    if(l[0][k].getText().equals(""))
                    {
                        if(l[2][k].getText().equals(l[3][k].getText()))
                        {
                            u = Integer.parseInt(l[2][k].getText());
                            v = Integer.parseInt(l[3][k].getText());
                            l[0][k].setText((u+v)+"");
                            l[2][k].setText("");
                            l[3][k].setText("");
                        }
                        else
                        {
                            l[0][k].setText(l[2][k].getText());
                            l[1][k].setText(l[3][k].getText());
                            l[2][k].setText("");l[3][k].setText("");
                        }
                    }
                    else
                    {
                        if(l[0][k].getText().equals(l[2][k].getText()))
                        {
                            u = Integer.parseInt(l[0][k].getText());
                            v = Integer.parseInt(l[2][k].getText());
                            l[0][k].setText(""+(u+v));
                            l[1][k].setText(l[3][k].getText());
                            l[2][k].setText("");l[3][k].setText("");
                        }
                        else if(l[2][k].getText().equals(l[3][k].getText()))
                        {
                            u = Integer.parseInt(l[2][k].getText());
                            v = Integer.parseInt(l[3][k].getText());
                            l[1][k].setText(""+(u+v));
                            l[2][k].setText("");l[3][k].setText("");
                        }
                        else
                        {
                            l[1][k].setText(l[2][k].getText());
                            l[2][k].setText(l[3][k].getText());
                            l[3][k].setText("");
                        }
                    }
                }
                else if(l[0][k].getText().isEmpty())
                {
                    if(l[1][k].getText().equals(l[2][k].getText()))
                    {
                        u = Integer.parseInt(l[2][k].getText());
                        l[0][k].setText(""+(2*u));
                        l[1][k].setText(l[3][k].getText());
                        l[2][k].setText("");l[3][k].setText("");
                    }
                    else if(l[3][k].getText().equals(l[2][k].getText()))
                    {
                        l[0][k].setText(l[1][k].getText());
                        u = Integer.parseInt(l[2][k].getText());
                        l[1][k].setText(""+(2*u));
                        l[2][k].setText("");l[3][k].setText("");
                    }
                    else
                    {
                        l[0][k].setText(l[1][k].getText());
                        l[1][k].setText(l[2][k].getText());
                        l[2][k].setText(l[3][k].getText());
                        l[3][k].setText("");
                    }
                }
                else
                {
                    if(l[0][k].getText().equals(l[1][k].getText()) && l[2][k].getText().equals(l[3][k].getText()))
                    {
                        u = Integer.parseInt(l[0][k].getText());
                        v = Integer.parseInt(l[1][k].getText());
                        w = Integer.parseInt(l[2][k].getText());
                        z = Integer.parseInt(l[3][k].getText());
                        l[0][k].setText(""+(u+v));
                        l[1][k].setText(""+(w+z));
                        l[2][k].setText("");l[3][k].setText("");
                    }
                    else if(l[1][k].getText().equals(l[0][k].getText()))
                    {
                        u = Integer.parseInt(l[1][k].getText());
                        v = Integer.parseInt(l[0][k].getText());
                        l[0][k].setText(""+(u+v));
                        l[1][k].setText(l[2][k].getText());
                        l[2][k].setText(l[3][k].getText());
                        l[3][k].setText("");
                    }
                    else if(l[1][k].getText().equals(l[2][k].getText()))
                    {
                        u = Integer.parseInt(l[1][k].getText());
                        v = Integer.parseInt(l[2][k].getText());
                        l[1][k].setText(""+(u+v));
                        l[2][k].setText(l[3][k].getText());
                        l[3][k].setText("");
                    }
                    else if(l[3][k].getText().equals(l[2][k].getText()))
                    {
                        u = Integer.parseInt(l[3][k].getText());
                        v = Integer.parseInt(l[2][k].getText());
                        l[2][k].setText(""+(u+v));
                        l[3][k].setText("");
                    }
                }
            }
        }
        if(e.getSource()==b2)
        {
            for (int k = 0; k < 4; k++) 
            {
                int u=0,v=0,w=0,z=0;
                if(l[0][k].getText().equals("") && l[1][k].getText().equals(""))
                {
                    if(l[3][k].getText().equals(""))
                    {
                        l[3][k].setText(l[2][k].getText());                        
                        l[2][k].setText("");
                    }
                    else if(l[3][k].getText().equals(l[2][k].getText()))
                    {
                        u = Integer.parseInt(l[2][k].getText());
                        l[3][k].setText(""+(2*u));
                        l[2][k].setText("");
                    }                    
                }
                else if(l[0][k].getText().equals("") && l[2][k].getText().equals(""))
                {
                    if(l[3][k].getText().equals(""))
                    {
                        l[3][k].setText(l[1][k].getText());
                    }
                    else if(l[3][k].getText().equals(l[1][k].getText()))
                    {
                        u = Integer.parseInt(l[1][k].getText());
                        l[3][k].setText(""+(2*u));
                    }
                    else
                    {
                        l[2][k].setText(l[1][k].getText());
                    }
                    l[1][k].setText("");
                }
                else if(l[1][k].getText().equals("") && l[2][k].getText().equals(""))
                {
                    if(l[3][k].getText().equals(""))
                    {
                        l[3][k].setText(l[0][k].getText());
                    }
                    else if(l[3][k].getText().equals(l[0][k].getText()))
                    {
                        u = Integer.parseInt(l[0][k].getText());
                        l[3][k].setText(""+(2*u));
                    }
                    else
                    {
                        l[2][k].setText(l[0][k].getText());
                    }
                    l[0][k].setText("");
                }
                else if(l[2][k].getText().equals(""))
                {
                    if(l[3][k].getText().equals(""))
                    {
                        if(l[1][k].getText().equals(l[0][k].getText()))
                        {
                            u = Integer.parseInt(l[1][k].getText());
                            v = Integer.parseInt(l[0][k].getText());
                            l[3][k].setText((u+v)+"");
                            l[1][k].setText("");
                            l[0][k].setText("");
                        }
                        else
                        {
                            l[3][k].setText(l[1][k].getText());
                            l[2][k].setText(l[0][k].getText());
                            l[0][k].setText("");
                            l[1][k].setText("");
                        }
                    }
                    else
                    {
                        if(l[3][k].getText().equals(l[1][k].getText()))
                        {
                            u = Integer.parseInt(l[3][k].getText());
                            v = Integer.parseInt(l[1][k].getText());
                            l[3][k].setText(""+(u+v));
                            l[2][k].setText(l[0][k].getText());
                            l[0][k].setText("");
                            l[1][k].setText("");
                        }
                        else if(l[1][k].getText().equals(l[0][k].getText()))
                        {
                            u = Integer.parseInt(l[1][k].getText());
                            v = Integer.parseInt(l[0][k].getText());
                            l[2][k].setText(""+(u+v));
                            l[0][k].setText("");
                            l[1][k].setText("");
                        }
                        else
                        {
                            l[2][k].setText(l[1][k].getText());
                            l[1][k].setText(l[0][k].getText());
                            l[0][k].setText("");
                        }
                    }
                }
                else if(l[1][k].getText().equals(""))
                {
                    if(l[3][k].getText().equals(""))
                    {
                        if(l[2][k].getText().equals(l[0][k].getText()))
                        {
                            u = Integer.parseInt(l[2][k].getText());
                            v = Integer.parseInt(l[0][k].getText());
                            l[3][k].setText((u+v)+"");
                            l[2][k].setText("");
                            l[0][k].setText("");
                        }
                        else
                        {
                            l[3][k].setText(l[2][k].getText());
                            l[2][k].setText(l[0][k].getText());
                            l[0][k].setText("");
                        }
                    }
                    else
                    {
                        if(l[3][k].getText().equals(l[2][k].getText()))
                        {
                            u = Integer.parseInt(l[3][k].getText());
                            v = Integer.parseInt(l[2][k].getText());
                            l[3][k].setText(""+(u+v));
                            l[2][k].setText(l[0][k].getText());
                            l[0][k].setText("");
                        }
                        else if(l[2][k].getText().equals(l[0][k].getText()))
                        {
                            u = Integer.parseInt(l[2][k].getText());
                            v = Integer.parseInt(l[0][k].getText());
                            l[2][k].setText(""+(u+v));
                            l[0][k].setText("");
                        }
                        else
                        {
                            l[1][k].setText(l[0][k].getText());
                            l[0][k].setText("");
                        }
                    }
                }
                else if(l[0][k].getText().equals(""))
                {
                    if(l[3][k].getText().equals(""))
                    {
                        if(l[2][k].getText().equals(l[1][k].getText()))
                        {
                            u = Integer.parseInt(l[2][k].getText());
                            v = Integer.parseInt(l[1][k].getText());
                            l[3][k].setText((u+v)+"");
                            l[2][k].setText("");
                            l[1][k].setText("");
                        }
                        else
                        {
                            l[3][k].setText(l[2][k].getText());
                            l[2][k].setText(l[1][k].getText());
                            l[1][k].setText("");
                        }
                    }
                    else
                    {
                        if(l[3][k].getText().equals(l[2][k].getText()))
                        {
                            u = Integer.parseInt(l[3][k].getText());
                            v = Integer.parseInt(l[2][k].getText());
                            l[3][k].setText(""+(u+v));
                            l[2][k].setText(l[1][k].getText());
                            l[1][k].setText("");
                        }
                        else if(l[2][k].getText().equals(l[1][k].getText()))
                        {
                            u = Integer.parseInt(l[2][k].getText());
                            v = Integer.parseInt(l[1][k].getText());
                            l[2][k].setText(""+(u+v));
                            l[1][k].setText("");
                        }                        
                    }
                }
                else if(l[3][k].getText().isEmpty())
                {
                    if(l[1][k].getText().equals(l[2][k].getText()))
                    {
                        u = Integer.parseInt(l[2][k].getText());
                        l[3][k].setText(""+(2*u));
                        l[2][k].setText(l[0][k].getText());
                        l[1][k].setText("");l[0][k].setText("");
                    }
                    else if(l[0][k].getText().equals(l[1][k].getText()))
                    {
                        l[3][k].setText(l[2][k].getText());
                        u = Integer.parseInt(l[1][k].getText());
                        l[2][k].setText(""+(2*u));
                        l[1][k].setText("");l[0][k].setText("");
                    }
                    else
                    {
                        l[3][k].setText(l[2][k].getText());
                        l[2][k].setText(l[1][k].getText());
                        l[1][k].setText(l[0][k].getText());
                        l[0][k].setText("");
                    }
                }
                else
                {
                    if(l[0][k].getText().equals(l[1][k].getText()) && l[2][k].getText().equals(l[3][k].getText()))
                    {
                        u = Integer.parseInt(l[0][k].getText());
                        v = Integer.parseInt(l[1][k].getText());
                        w = Integer.parseInt(l[2][k].getText());
                        z = Integer.parseInt(l[3][k].getText());
                        l[2][k].setText(""+(u+v));
                        l[3][k].setText(""+(w+z));
                        l[0][k].setText("");l[1][k].setText("");
                    }
                    else if(l[3][k].getText().equals(l[2][k].getText()))
                    {
                        u = Integer.parseInt(l[3][k].getText());
                        v = Integer.parseInt(l[2][k].getText());
                        l[3][k].setText(""+(u+v));
                        l[2][k].setText(l[1][k].getText());
                        l[1][k].setText(l[0][k].getText());
                        l[0][k].setText("");
                    }
                    else if(l[1][k].getText().equals(l[2][k].getText()))
                    {
                        u = Integer.parseInt(l[1][k].getText());
                        v = Integer.parseInt(l[2][k].getText());
                        l[2][k].setText(""+(u+v));
                        l[1][k].setText(l[0][k].getText());
                        l[0][k].setText("");
                    }
                    else if(l[1][k].getText().equals(l[0][k].getText()))
                    {
                        u = Integer.parseInt(l[0][k].getText());
                        v = Integer.parseInt(l[1][k].getText());
                        l[1][k].setText(""+(u+v));
                        l[0][k].setText("");
                    }
                    
                }
            }
        }
        if (e.getSource() == b3) 
        {
            for (int k = 0; k < 4; k++) 
            {
                int u=0,v=0,w=0,z=0;
                if (l[k][1].getText().equals("") && l[k][2].getText().equals("")) 
                {   
                        if (l[k][0].getText().equals("")) 
                        {
                            l[k][0].setText(l[k][3].getText());
                        } 
                        else if (l[k][0].getText().equals(l[k][3].getText())) 
                        {
                            
                            u = Integer.parseInt(l[k][0].getText());
                            v = Integer.parseInt(l[k][3].getText());
                            l[k][0].setText((u+v)+"");
                        }
                        else
                        {
                            l[k][1].setText(l[k][3].getText());
                        }
                    l[k][3].setText("");
                }
                else if(l[k][3].getText().equals("") && l[k][2].getText().equals(""))
                {
                    if (l[k][0].getText().equals("")) 
                        {
                            l[k][0].setText(l[k][1].getText());
                            l[k][1].setText("");
                        } 
                        else if (l[k][0].getText().equals(l[k][1].getText())) 
                        {                            
                            u = Integer.parseInt(l[k][0].getText());
                            v = Integer.parseInt(l[k][1].getText());
                            l[k][0].setText((u+v)+"");
                            l[k][1].setText("");
                        }                                      
                }
                else if(l[k][3].getText().equals("") && l[k][1].getText().equals(""))
                {
                    if (l[k][0].getText().equals("")) 
                        {
                            l[k][0].setText(l[k][2].getText());
                        } 
                        else if (l[k][0].getText().equals(l[k][2].getText())) 
                        {                            
                            u = Integer.parseInt(l[k][0].getText());
                            v = Integer.parseInt(l[k][2].getText());
                            l[k][0].setText((u+v)+"");
                        }                                      
                        else
                        {
                            l[k][1].setText(l[k][2].getText());
                        }                    
                    l[k][2].setText("");
                }
                else if(l[k][3].getText().equals(""))
                {
                    if(l[k][0].getText().equals(""))
                    {
                        if(l[k][1].getText().equals(l[k][2].getText()))
                        {
                            u = Integer.parseInt(l[k][1].getText());
                            v = Integer.parseInt(l[k][2].getText());
                            l[k][0].setText((u+v)+"");
                            l[k][1].setText("");
                            l[k][2].setText("");
                        }
                        else
                        {
                            l[k][0].setText(l[k][1].getText());
                            l[k][1].setText(l[k][2].getText());
                            l[k][2].setText("");
                        }
                    }
                    else
                    {
                        if(l[k][0].getText().equals(l[k][1].getText()))
                        {
                            u = Integer.parseInt(l[k][0].getText());
                            v = Integer.parseInt(l[k][1].getText());
                            l[k][0].setText(""+(u+v));
                            l[k][1].setText(l[k][2].getText());
                            l[k][2].setText("");
                        }
                        else if(l[k][1].getText().equals(l[k][2].getText()))
                        {
                            u = Integer.parseInt(l[k][1].getText());
                            v = Integer.parseInt(l[k][2].getText());
                            l[k][1].setText(""+(u+v));
                            l[k][2].setText("");
                        }
                    }
                }
                else if(l[k][2].getText().equals(""))
                {
                    if(l[k][0].getText().equals(""))
                    {
                        if(l[k][1].getText().equals(l[k][3].getText()))
                        {
                            u = Integer.parseInt(l[k][1].getText());
                            v = Integer.parseInt(l[k][3].getText());
                            l[k][0].setText((u+v)+"");
                            l[k][1].setText("");
                            l[k][3].setText("");
                        }
                        else
                        {
                            l[k][0].setText(l[k][1].getText());
                            l[k][1].setText(l[k][3].getText());
                            l[k][3].setText("");
                        }
                    }
                    else
                    {
                        if(l[k][0].getText().equals(l[k][1].getText()))
                        {
                            u = Integer.parseInt(l[k][0].getText());
                            v = Integer.parseInt(l[k][1].getText());
                            l[k][0].setText(""+(u+v));
                            l[k][1].setText(l[k][3].getText());
                            l[k][3].setText("");
                        }
                        else if(l[k][1].getText().equals(l[k][3].getText()))
                        {
                            u = Integer.parseInt(l[k][1].getText());
                            v = Integer.parseInt(l[k][3].getText());
                            l[k][1].setText(""+(u+v));
                            l[k][3].setText("");
                        }
                        else
                        {
                            l[k][2].setText(l[k][3].getText());
                            l[k][3].setText("");
                        }
                    }
                }
                else if(l[k][1].getText().equals(""))
                {
                    if(l[k][0].getText().equals(""))
                    {
                        if(l[k][2].getText().equals(l[k][3].getText()))
                        {
                            u = Integer.parseInt(l[k][2].getText());
                            v = Integer.parseInt(l[k][3].getText());
                            l[k][0].setText((u+v)+"");
                            l[k][2].setText("");
                            l[k][3].setText("");
                        }
                        else
                        {
                            l[k][0].setText(l[k][2].getText());
                            l[k][1].setText(l[k][3].getText());
                            l[k][2].setText("");l[k][3].setText("");
                        }
                    }
                    else
                    {
                        if(l[k][0].getText().equals(l[k][2].getText()))
                        {
                            u = Integer.parseInt(l[k][0].getText());
                            v = Integer.parseInt(l[k][2].getText());
                            l[k][0].setText(""+(u+v));
                            l[k][1].setText(l[k][3].getText());
                            l[k][2].setText("");l[k][3].setText("");
                        }
                        else if(l[k][2].getText().equals(l[k][3].getText()))
                        {
                            u = Integer.parseInt(l[k][2].getText());
                            v = Integer.parseInt(l[k][3].getText());
                            l[k][1].setText(""+(u+v));
                            l[k][2].setText("");l[k][3].setText("");
                        }
                        else
                        {
                            l[k][1].setText(l[k][2].getText());
                            l[k][2].setText(l[k][3].getText());
                            l[k][3].setText("");
                        }
                    }
                }
                else if(l[k][0].getText().isEmpty())
                {
                    if(l[k][1].getText().equals(l[k][2].getText()))
                    {
                        u = Integer.parseInt(l[k][2].getText());
                        l[k][0].setText(""+(2*u));
                        l[k][1].setText(l[k][3].getText());
                        l[k][2].setText("");l[k][3].setText("");
                    }
                    else if(l[k][3].getText().equals(l[k][2].getText()))
                    {
                        l[k][0].setText(l[k][1].getText());
                        u = Integer.parseInt(l[k][2].getText());
                        l[k][1].setText(""+(2*u));
                        l[k][2].setText("");l[k][3].setText("");
                    }
                    else
                    {
                        l[k][0].setText(l[k][1].getText());
                        l[k][1].setText(l[k][2].getText());
                        l[k][2].setText(l[k][3].getText());
                        l[k][3].setText("");
                    }
                }
                else
                {
                    if(l[k][0].getText().equals(l[k][1].getText()) && l[k][2].getText().equals(l[k][3].getText()))
                    {
                        u = Integer.parseInt(l[k][0].getText());
                        v = Integer.parseInt(l[k][1].getText());
                        w = Integer.parseInt(l[k][2].getText());
                        z = Integer.parseInt(l[k][3].getText());
                        l[k][0].setText(""+(u+v));
                        l[k][1].setText(""+(w+z));
                        l[k][2].setText("");l[k][3].setText("");
                    }
                    else if(l[k][1].getText().equals(l[k][0].getText()))
                    {
                        u = Integer.parseInt(l[k][1].getText());
                        v = Integer.parseInt(l[k][0].getText());
                        l[k][0].setText(""+(u+v));
                        l[k][1].setText(l[k][2].getText());
                        l[k][2].setText(l[k][3].getText());
                        l[k][3].setText("");
                    }
                    else if(l[k][1].getText().equals(l[k][2].getText()))
                    {
                        u = Integer.parseInt(l[k][1].getText());
                        v = Integer.parseInt(l[k][2].getText());
                        l[k][1].setText(""+(u+v));
                        l[k][2].setText(l[k][3].getText());
                        l[k][3].setText("");
                    }
                    else if(l[k][3].getText().equals(l[k][2].getText()))
                    {
                        u = Integer.parseInt(l[k][3].getText());
                        v = Integer.parseInt(l[k][2].getText());
                        l[k][2].setText(""+(u+v));
                        l[k][3].setText("");
                    }
                }
            }
        }
        if(e.getSource()==b4)
        {
            for (int k = 0; k < 4; k++) 
            {
                int u=0,v=0,w=0,z=0;
                if(l[k][0].getText().equals("") && l[k][1].getText().equals(""))
                {
                    if(l[k][3].getText().equals(""))
                    {
                        l[k][3].setText(l[k][2].getText());                        
                        l[k][2].setText("");
                    }
                    else if(l[k][3].getText().equals(l[k][2].getText()))
                    {
                        u = Integer.parseInt(l[k][2].getText());
                        l[k][3].setText(""+(2*u));
                        l[k][2].setText("");
                    }                    
                }
                else if(l[k][0].getText().equals("") && l[k][2].getText().equals(""))
                {
                    if(l[k][3].getText().equals(""))
                    {
                        l[k][3].setText(l[k][1].getText());
                    }
                    else if(l[k][3].getText().equals(l[k][1].getText()))
                    {
                        u = Integer.parseInt(l[k][1].getText());
                        l[k][3].setText(""+(2*u));
                    }
                    else
                    {
                        l[k][2].setText(l[k][1].getText());
                    }
                    l[k][1].setText("");
                }
                else if(l[k][1].getText().equals("") && l[k][2].getText().equals(""))
                {
                    if(l[k][3].getText().equals(""))
                    {
                        l[k][3].setText(l[k][0].getText());
                    }
                    else if(l[k][3].getText().equals(l[k][0].getText()))
                    {
                        u = Integer.parseInt(l[k][0].getText());
                        l[k][3].setText(""+(2*u));
                    }
                    else
                    {
                        l[k][2].setText(l[k][0].getText());
                    }
                    l[k][0].setText("");
                }
                else if(l[k][2].getText().equals(""))
                {
                    if(l[k][3].getText().equals(""))
                    {
                        if(l[k][1].getText().equals(l[k][0].getText()))
                        {
                            u = Integer.parseInt(l[k][1].getText());
                            v = Integer.parseInt(l[k][0].getText());
                            l[k][3].setText((u+v)+"");
                            l[k][1].setText("");
                            l[k][0].setText("");
                        }
                        else
                        {
                            l[k][3].setText(l[k][1].getText());
                            l[k][2].setText(l[k][0].getText());
                            l[k][0].setText("");
                            l[k][1].setText("");
                        }
                    }
                    else
                    {
                        if(l[k][3].getText().equals(l[k][1].getText()))
                        {
                            u = Integer.parseInt(l[k][3].getText());
                            v = Integer.parseInt(l[k][1].getText());
                            l[k][3].setText(""+(u+v));
                            l[k][2].setText(l[k][0].getText());
                            l[k][0].setText("");
                            l[k][1].setText("");
                        }
                        else if(l[k][1].getText().equals(l[k][0].getText()))
                        {
                            u = Integer.parseInt(l[k][1].getText());
                            v = Integer.parseInt(l[k][0].getText());
                            l[k][2].setText(""+(u+v));
                            l[k][0].setText("");
                            l[k][1].setText("");
                        }
                        else
                        {
                            l[k][2].setText(l[k][1].getText());
                            l[k][1].setText(l[k][0].getText());
                            l[k][0].setText("");
                        }
                    }
                }
                else if(l[k][1].getText().equals(""))
                {
                    if(l[k][3].getText().equals(""))
                    {
                        if(l[k][2].getText().equals(l[k][0].getText()))
                        {
                            u = Integer.parseInt(l[k][2].getText());
                            v = Integer.parseInt(l[k][0].getText());
                            l[k][3].setText((u+v)+"");
                            l[k][2].setText("");
                            l[k][0].setText("");
                        }
                        else
                        {
                            l[k][3].setText(l[k][2].getText());
                            l[k][2].setText(l[k][0].getText());
                            l[k][0].setText("");
                        }
                    }
                    else
                    {
                        if(l[k][3].getText().equals(l[k][2].getText()))
                        {
                            u = Integer.parseInt(l[k][3].getText());
                            v = Integer.parseInt(l[k][2].getText());
                            l[k][3].setText(""+(u+v));
                            l[k][2].setText(l[k][0].getText());
                            l[k][0].setText("");
                        }
                        else if(l[k][2].getText().equals(l[k][0].getText()))
                        {
                            u = Integer.parseInt(l[k][2].getText());
                            v = Integer.parseInt(l[k][0].getText());
                            l[k][2].setText(""+(u+v));
                            l[k][0].setText("");
                        }
                        else
                        {
                            l[k][1].setText(l[k][0].getText());
                            l[k][0].setText("");
                        }
                    }
                }
                else if(l[k][0].getText().equals(""))
                {
                    if(l[k][3].getText().equals(""))
                    {
                        if(l[k][2].getText().equals(l[k][1].getText()))
                        {
                            u = Integer.parseInt(l[k][2].getText());
                            v = Integer.parseInt(l[k][1].getText());
                            l[k][3].setText((u+v)+"");
                            l[k][2].setText("");
                            l[k][1].setText("");
                        }
                        else
                        {
                            l[k][3].setText(l[k][2].getText());
                            l[k][2].setText(l[k][1].getText());
                            l[k][1].setText("");
                        }
                    }
                    else
                    {
                        if(l[k][3].getText().equals(l[k][2].getText()))
                        {
                            u = Integer.parseInt(l[k][3].getText());
                            v = Integer.parseInt(l[k][2].getText());
                            l[k][3].setText(""+(u+v));
                            l[k][2].setText(l[k][1].getText());
                            l[k][1].setText("");
                        }
                        else if(l[k][2].getText().equals(l[k][1].getText()))
                        {
                            u = Integer.parseInt(l[k][2].getText());
                            v = Integer.parseInt(l[k][1].getText());
                            l[k][2].setText(""+(u+v));
                            l[k][1].setText("");
                        }                        
                    }
                }
                else if(l[k][3].getText().isEmpty())
                {
                    if(l[k][1].getText().equals(l[k][2].getText()))
                    {
                        u = Integer.parseInt(l[k][2].getText());
                        l[k][3].setText(""+(2*u));
                        l[k][2].setText(l[k][0].getText());
                        l[k][1].setText("");l[k][0].setText("");
                    }
                    else if(l[k][0].getText().equals(l[k][1].getText()))
                    {
                        l[k][3].setText(l[k][2].getText());
                        u = Integer.parseInt(l[k][1].getText());
                        l[k][2].setText(""+(2*u));
                        l[k][1].setText("");l[k][0].setText("");
                    }
                    else
                    {
                        l[k][3].setText(l[k][2].getText());
                        l[k][2].setText(l[k][1].getText());
                        l[k][1].setText(l[k][0].getText());
                        l[k][0].setText("");
                    }
                }
                else
                {
                    if(l[k][0].getText().equals(l[k][1].getText()) && l[k][2].getText().equals(l[k][3].getText()))
                    {
                        u = Integer.parseInt(l[k][0].getText());
                        v = Integer.parseInt(l[k][1].getText());
                        w = Integer.parseInt(l[k][2].getText());
                        z = Integer.parseInt(l[k][3].getText());
                        l[k][2].setText(""+(u+v));
                        l[k][3].setText(""+(w+z));
                        l[k][0].setText("");l[k][1].setText("");
                    }
                    else if(l[k][3].getText().equals(l[k][2].getText()))
                    {
                        u = Integer.parseInt(l[k][3].getText());
                        v = Integer.parseInt(l[k][2].getText());
                        l[k][3].setText(""+(u+v));
                        l[k][2].setText(l[k][1].getText());
                        l[k][1].setText(l[k][0].getText());
                        l[k][0].setText("");
                    }
                    else if(l[k][1].getText().equals(l[k][2].getText()))
                    {
                        u = Integer.parseInt(l[k][1].getText());
                        v = Integer.parseInt(l[k][2].getText());
                        l[k][2].setText(""+(u+v));
                        l[k][1].setText(l[k][0].getText());
                        l[k][0].setText("");
                    }
                    else if(l[k][1].getText().equals(l[k][0].getText()))
                    {
                        u = Integer.parseInt(l[k][0].getText());
                        v = Integer.parseInt(l[k][1].getText());
                        l[k][1].setText(""+(u+v));
                        l[k][0].setText("");
                    }
                }
            }
        }
        int temp = random();
        while(temp!=1)
        {
           te = random();
           temp = te;
        }
        if(temp==1)
        {
            random(temp);
        }
    }
    public int random()
    {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(l[i][j].getBackground()==Color.CYAN)
                {
                    l[i][j].setBackground(Color.WHITE);
                }
//                if(l[i][j].getText().equals("2048") || l[i][j].getText().equals("1024"))
//                {
//                    l[i][j].setBackground(Color.YELLOW);
//                }
            }
        }
            Random r = new Random();        
            int x = r.nextInt(4);
            int y = r.nextInt(4);
            this.p = x;   this.q = y; 
            if (l[x][y].getText().equals("")) 
            {
                return 1;
            }
            else
            {
                return 0;
            }
    }
    public void random(int var)
    {
            l[this.p][this.q].setText("2");
            l[this.p][this.q].setBackground(Color.CYAN);
    }
}