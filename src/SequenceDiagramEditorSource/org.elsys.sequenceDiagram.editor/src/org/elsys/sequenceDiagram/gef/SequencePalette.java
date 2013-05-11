package org.elsys.sequenceDiagram.gef;

import org.eclipse.gef.palette.CombinedTemplateCreationEntry;
import org.eclipse.gef.palette.ConnectionCreationToolEntry;
import org.eclipse.gef.palette.MarqueeToolEntry;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.SelectionToolEntry;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.jface.resource.ImageDescriptor;
import org.elsys.sequenceDiagram.gef.model.SequenceModelFactory;

public class SequencePalette extends PaletteRoot {
	public static String LIFELINE = "L_TEMP", ACTIVATION_BAR = "AB_TEMP", NOTE = "N_TEMP",
	ALT_CF = "ACF_TEMP", OPT_CF = "OCF_TEMP", LOOP_CF = "LCF_TEMP", BREAK_CF = "BCF_TEMP",
	PARALLEL_CF = "PCF_TEMP", SEND_CONN="SC_TEMP", RETURN_CONN="RC_TEMP";
	
	public SequencePalette(){
		add(createToolsGroup());
		add(createTemplatesGroup());
		add(createCombinedFragments());
	}

	private PaletteDrawer createTemplatesGroup() {
		PaletteDrawer drawer = new PaletteDrawer("Diagram Elements");
		
		CombinedTemplateCreationEntry lifeline = new CombinedTemplateCreationEntry(
			"Lifeline", "Create a lifeline", LIFELINE, new SequenceModelFactory(LIFELINE), 
			ImageDescriptor.createFromFile(SequenceGraphicalEditor.class, "icons/lifeline.png"), null);
		drawer.add(lifeline);
		
		CombinedTemplateCreationEntry activationBar = new CombinedTemplateCreationEntry(
			"Activation Bar", "Create an activation bar", ACTIVATION_BAR, 
			new SequenceModelFactory(ACTIVATION_BAR),
			ImageDescriptor.createFromFile(SequenceGraphicalEditor.class, "icons/activationBar.png"), null);
		drawer.add(activationBar);
		
		CombinedTemplateCreationEntry note = new CombinedTemplateCreationEntry(
			"Note", "Create a note", NOTE,
			new SequenceModelFactory(NOTE),
			ImageDescriptor.createFromFile(SequenceGraphicalEditor.class, "icons/note.png"), null);
		drawer.add(note);
		
		return drawer;		
	}

	private PaletteDrawer createCombinedFragments() {
		PaletteDrawer drawer = new PaletteDrawer("Combined Fragments");
		
		CombinedTemplateCreationEntry alt = new CombinedTemplateCreationEntry(
				"  Alternative", "Create an alternative combined fragment", ALT_CF,
				new SequenceModelFactory(ALT_CF), 
				ImageDescriptor.createFromFile(SequenceGraphicalEditor.class, "icons/alt.png"), null);
		drawer.add(alt);
		
		CombinedTemplateCreationEntry opt = new CombinedTemplateCreationEntry(
				"  Option", "Create an option combined fragment", OPT_CF,
				new SequenceModelFactory(OPT_CF), 
				ImageDescriptor.createFromFile(SequenceGraphicalEditor.class, "icons/opt.png"), null);
		drawer.add(opt);
		
		CombinedTemplateCreationEntry loop= new CombinedTemplateCreationEntry(
				"  Loop", "Create an loop combined fragment", LOOP_CF,
				new SequenceModelFactory(LOOP_CF), 
				ImageDescriptor.createFromFile(SequenceGraphicalEditor.class, "icons/loop.png"), null);
		drawer.add(loop);
		
		CombinedTemplateCreationEntry br = new CombinedTemplateCreationEntry(
				"  Break", "Create an break combined fragment", BREAK_CF,
				new SequenceModelFactory(BREAK_CF), 
				ImageDescriptor.createFromFile(SequenceGraphicalEditor.class, "icons/break.png"), null);
		drawer.add(br);
		
		CombinedTemplateCreationEntry par = new CombinedTemplateCreationEntry(
				"  Parallel", "Create an parallel combined fragment", PARALLEL_CF,
				new SequenceModelFactory(PARALLEL_CF), 
				ImageDescriptor.createFromFile(SequenceGraphicalEditor.class, "icons/par.png"), null);
		drawer.add(par);
		
		return drawer;
	}

	private PaletteGroup createToolsGroup() {
		PaletteGroup tools = new PaletteGroup("Tools");
		ToolEntry tool = new SelectionToolEntry();
		tools.add(tool);
		setDefaultEntry(tool);
		tool = new MarqueeToolEntry();
		tools.add(tool);
		
		tool = new ConnectionCreationToolEntry("Send Connection",
				"Used to send messages between activation bars", 
				new SequenceModelFactory(SEND_CONN),
				ImageDescriptor.createFromFile(SequenceGraphicalEditor.class, "icons/sendConnection.png"),
				null);
		tools.add(tool);
		tool = new ConnectionCreationToolEntry("ReturnConnection",
				"Used to return messages between activation bars", 
				new SequenceModelFactory(RETURN_CONN),
				ImageDescriptor.createFromFile(SequenceGraphicalEditor.class, "icons/returnConnection.png"),
				null);
		tools.add(tool);
		return tools;
	}
}
