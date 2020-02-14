/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import javax.swing.JFileChooser;
import javax.swing.JTextArea;

/**
 *
 * @author personal
 */
public interface IGenerateMarkdown {
    final JFileChooser fc = new JFileChooser();
    void saveAsMarkdown(JTextArea area);
}
