package br.paduan;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;


public class StackTest {

    private  Stack p;

    @Before
    public void setup(){
        p = new Stack(3);
    }

    @Test
    public void testEmptyStack() {
        boolean vazia = p.isEmpty();

        assertTrue("Nova pilha deve estar vazia", vazia);
    }

    @Test
    public void testPush() {
        p.push(1);
        boolean vazia = p.isEmpty();

        assertFalse("Pilha após inserção não deve estar vazia", vazia);
    }

    @Test
    public void testPeek() {
        p.push(1);
        p.push(2);
        
        int resp = p.peek();

        assertEquals("O valor no topo após 2 iserções deve ser 2", 2, resp);
    }

    @Test
    public void testisFull() {
        p.push(1);
        p.push(2);
        p.push(3);
        
        boolean full = p.isFull();

        assertTrue("A pilha deve estar cheia", full);
    }

    @Test
    public void testPop() {
        p.push(1);
        p.push(2);
        
       int value1 = p.pop();
       int value2 = p.pop();

       assertEquals("Remover o primeiro elemento deve ser 2", 2, value1);
       assertEquals("Remover o segundo elemento deve ser 1", 1, value2);

       boolean vazia = p.isEmpty();
       assertTrue("Nova pilha deve estar vazia", vazia);

    }
}
