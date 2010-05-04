class DockingFrameGriffonPlugin {
    def version = 0.1
    def griffonVersion = "0.4-SNAPSHOT > *" 
    def dependsOn = [:]
    // optional. Valid values are: swing, javafx, swt, pivot, gtk
    // def toolkits = ['swing']
    // optional. Valid values are linux, windows, macosx, solaris
    // def platforms = []

    // TODO Fill in these fields
    def author = "Hackergarten"
    def authorEmail = "hackergarten@googlegroups.com"
    def title = "Griffon docking frame add-on"
    def description = '''\\
The docking frame add-on for Griffon, alows the user to have movable panels, or other components, in a frame, the docking frame.
The panels can be rearranged inside the frame, stacked on top of each other (i.e. creating a tabbed pane), or even moved to
another docking frame in the application.
'''

    // URL to the plugin's documentation
    def documentation = "http://griffon.codehaus.org/DockingFrame+Plugin"
}
