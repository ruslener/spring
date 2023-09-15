package org.ruslanshkirman;

import org.springframework.stereotype.Component;


public class PopMusic implements Music{
    @Override
    public String getSong() {
        return "Ms. Jackson";
    }
}
