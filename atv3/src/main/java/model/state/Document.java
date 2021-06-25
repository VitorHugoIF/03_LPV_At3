/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.state;

/**
 *
 * @author vitor.marcelino
 */
public class Document {
    private String title;
    private IDocumentState state;   

    public Document() {
        this.state = DocumentStateDraft.getInstance();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public IDocumentState getState() {
        return state;
    }

    public void setState(IDocumentState state) {
        this.state = state;
    }
    
    public String toDraft(){
        return state.toDraft(this);
    }
    
    public String toModerate(){
        return state.toModerate(this);
    }
    
    public String toPublish(){
        return state.toPublish(this);
    }
}
