package com.neuedu.test2;



public class TestSale implements ITest {
    @Override
    public String sale() {

        System.out.println("sale");
        return "wuyun";
    }

    @Override
    public boolean login(String name, String psd) throws UserException {
        if (!"name".equals(name)){
            throw new UsernameException("�û�������");
        }
        if (!"123".equals(psd)){
            throw new PasswordException("���벻�ԣ�");
        }
        return true;
    }

}
