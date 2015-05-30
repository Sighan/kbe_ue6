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
public class ComparePredicate<V extends Comparable<V>> implements TreePredicate<V>{
    
    private V _minEle;
    private V _maxEle;
    
    public ComparePredicate(V minEle, V maxEle){
        _minEle = minEle;
        _maxEle = maxEle;
    }
    
    @Override
    public boolean isOk(Tree<V> tree) {
        if (tree.getValue().compareTo(_minEle) > 0 && tree.getValue().compareTo(_maxEle)<0) {
            return true;
        }
        return false;
    }
    
}
