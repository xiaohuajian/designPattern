package com.company.state.better;

import java.io.Serializable;

public interface State extends Serializable {

    void insertMoney();

    void ejectMoney();

    void makeGumball();

    void dispense();
}
