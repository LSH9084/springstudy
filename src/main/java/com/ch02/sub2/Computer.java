package com.ch02.sub2;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("com")
@RequiredArgsConstructor
public class Computer {

    private final CPU cpu;
    private final RAM ram;
    private final SSD ssd;

    public void show(){
        cpu.show();
        ram.show();
        ssd.show();
    }

}
