application {
    title='DockingFrameDemo'
    startupGroups = ['DockingFrameDemo']

    // Should Griffon exit when no Griffon created frames are showing?
    autoShutdown = true

    // If you want some non-standard application class, apply it here
    //frameClass = 'javax.swing.JFrame'
}
mvcGroups {
    // MVC Group for "DockingFrameDemo"
    'DockingFrameDemo' {
        model = 'DockingFrameDemoModel'
        controller = 'DockingFrameDemoController'
        view = 'DockingFrameDemoView'
    }

}
