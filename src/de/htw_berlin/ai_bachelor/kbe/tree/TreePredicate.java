/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.htw_berlin.ai_bachelor.kbe.tree;

/**
 *
 * @author dan
 */
public interface TreePredicate<V> {
    
    public boolean isOk(Tree<V> tree);
    
}
