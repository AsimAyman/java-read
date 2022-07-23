import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class main{

    public static void main(String[] args) {
        List<InvoiceHeader> invoiceHeaders =new  ArrayList<>();
        DateFormat dateFormat= new SimpleDateFormat("dd-MM-yyyy");
        JFrame frame =new JFrame();
        frame.setSize(500,500);
        frame.setVisible(true);
        JButton button =new JButton("Open File");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFileChooser fileChooser =new JFileChooser();
                int result =fileChooser.showOpenDialog(frame);
                if(result== JFileChooser.APPROVE_OPTION){
                    try{
                        FileReader fileReader = new FileReader(fileChooser.getSelectedFile());
                        BufferedReader br = new BufferedReader(fileReader);
                        for(int i=0;i<2;i++){
                        String lineText =br.readLine();
                            System.out.println(lineText);
                            String[] headers = lineText.split(",");
                            int num = Integer.parseInt(headers[0]);
                            Date date = dateFormat.parse(headers[1]);
                            String name = headers[2];
                            var ivo =new InvoiceHeader(num,name,date);
                            invoiceHeaders.add(ivo);
                            for (InvoiceHeader invo:invoiceHeaders){
                                invo.toString();
                            }

                        }
                    }catch (Exception ex){
                        ex.printStackTrace();
                    }

                }
        };});

        frame.add(button);
        frame.setLayout(new FlowLayout());


    }


}

