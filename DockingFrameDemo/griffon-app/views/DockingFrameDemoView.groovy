application(title:'DockingFrameDemo',
  //size:[320,480],
  pack:true,
  //location:[50,50],
  locationByPlatform:true,
  iconImage: imageIcon('/griffon-icon-48x48.png').image,
  iconImages: [imageIcon('/griffon-icon-48x48.png').image,
               imageIcon('/griffon-icon-32x32.png').image,
               imageIcon('/griffon-icon-16x16.png').image]
) {
	panel(border: emptyBorder(6)) {
		gridLayout(cols: 1, rows: 3)
	    dockingFrame {
	    	panel(title: 'Input', border: emptyBorder(10)) {
	    		gridLayout(cols: 2, rows: 3)
	    		
	    		// Row 1:
				label 'Username:'
				textField columns: 20, text:bind(target: model, targetProperty: 'username')
				
				// Row 2:
				label 'Password:'
				passwordField columns: 20, text:bind(target: model, targetProperty: 'password')
				
				// Row 3:
				label ''
				button text:'Login', enabled:bind {model.username && model.password}
	    	}
	    	panel(title: 'Button clicked bound output') {
	    		gridLayout(cols: 2, rows: 2)
	    		
	    		// Row 1:
	    		label 'Username:'
	    		textField columns: 20
	    		
	    		// Row 2:
	    		label 'Password:'
	    		passwordField columns: 20
	    	}
			panel(title: 'Panel 4') {
				label 'A panel in the first docking frame'
			}
			panel(title: 'Panel 5') {
				label 'A panel in the first docking frame'
			}
	    }
		
		panel() {
			label 'This panel is not a dockable frame.'
		}
		
		dockingFrame {
			panel(title: 'Panel 1') {
				label 'A panel in a second docking frame'
			}
			panel(title: 'Panel 2') {
				label 'A panel in a second docking frame'
			}
			panel(title: 'Panel 3') {
				label 'A panel in a second docking frame'
			}
	    	panel(title: 'Property changed bound output') {
	    		gridLayout(cols: 2, rows: 2)
	    		
	    		// Row 1:
				label 'Username:'
				textField text:bind {model.username}
				
				// Row 2:
				label 'Password:'
				textField text:bind {model.password}
	    	}
			
		}
    }
}
