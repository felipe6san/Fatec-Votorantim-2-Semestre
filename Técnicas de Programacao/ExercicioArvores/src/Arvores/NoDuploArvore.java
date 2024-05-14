package Arvores;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author fehzin
 */
public class NoDuploArvore {
    private Object info;
    private NoDuploArvore esquerdaNo;
    private NoDuploArvore direitaNo;
    
    public NoDuploArvore(Object info, NoDuploArvore esquerdaNo, NoDuploArvore direitaNo) {
        this.info = info;
        this.esquerdaNo = esquerdaNo;
        this.direitaNo = direitaNo;
    }


    public Object getInfo() {
        return info;
    }

    public NoDuploArvore getEsquerdaNo() {
        return esquerdaNo;
    }
    
    public NoDuploArvore getDireitaNo() {
        return direitaNo;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public void setEsquerdaNo(NoDuploArvore esquerdaNo) {
        this.esquerdaNo = esquerdaNo;
    }
    
    public void setDireitaNo(NoDuploArvore direitaNo) {
        this.direitaNo = direitaNo;
    }
    
}
