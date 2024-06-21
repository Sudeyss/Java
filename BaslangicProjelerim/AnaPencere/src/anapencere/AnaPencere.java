public AnaPencere(){
        initComponents();

        KelimeBilmeDurum=KelimeOlustur();
        btnTekrarOyna.setEnabled(true);
        x=10;
        pnlKelimeAlani.setLayout(new FlowLayout());
        for(int i=0;i<Harfler.length;i++){
             JButton harfButon=new JButton(Harfler[i]);
             harfButon.setFont(new Font("Arial",Font.BOLD,18));
             harfButon.setBounds(x,y,w,h);
             x=x+w+5;
              if(9==i||i==19){
                 y+=h+5;
                  x=10;
             }
             harfButon.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    System.out.println(harfButon.getText());
                }
            }
            };
            pnlHarfAlani.add(harfButon);
        }
}