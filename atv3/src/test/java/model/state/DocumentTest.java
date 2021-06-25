/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author vitor.marcelino
 */
public class DocumentTest {
    //Document doc;

    /*@BeforeEach
    public void setUp() {
        doc = new Document();
    }*/

    // Rascunho
    @Test
    public void testDoNotDraftDocument_draft() {
        Document doc = new Document();
        doc.setState(DocumentStateDraft.getInstance());
        assertEquals("Rascunho não realizado", doc.toDraft());
    }
    
    @Test
    public void testCanModerateTheDocument_draft() {
        Document doc = new Document();
        doc.setState(DocumentStateDraft.getInstance());
        assertEquals("Documento em moderação", doc.toModerate());
    }
    
    @Test
    public void testDoNotPublishDocument_draft() {
        Document doc = new Document();
        doc.setState(DocumentStateDraft.getInstance());
        assertEquals("Publicação não realizada", doc.toPublish());
    }
    
    // Moderação
    @Test
    public void testCanDraftTheDocument_moderation() {
        Document doc = new Document();
        doc.setState(DocumentStateModeration.getInstance());
        assertEquals("Documento em rascunho", doc.toDraft());
    }
    
    @Test
    public void testDoNotModerateDocument_moderation() {
        Document doc = new Document();
        doc.setState(DocumentStateModeration.getInstance());
        assertEquals("Moderação não realizada", doc.toModerate());
    }
    
    @Test
    public void testDoNotPublishDocument_moderation() {
        Document doc = new Document();
        doc.setState(DocumentStateModeration.getInstance());
        assertEquals("Documento publicado", doc.toPublish());
    }
    
    // Publicação
    @Test
    public void testCanDraftTheDocument_publication() {
        Document doc = new Document();
        doc.setState(DocumentStatePublication.getInstance());
        assertEquals("Documento em rascunho", doc.toDraft());
    }
    
    @Test
    public void testDoNotModerateDocument_publication() {
        Document doc = new Document();
        doc.setState(DocumentStatePublication.getInstance());
        assertEquals("Moderação não realizada", doc.toModerate());
    }
    
    @Test
    public void testDoNotPublishDocument_publication() {
        Document doc = new Document();
        doc.setState(DocumentStatePublication.getInstance());
        assertEquals("Publicação não realizada", doc.toPublish());
    }
}
