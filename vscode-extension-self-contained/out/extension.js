'use strict';
Object.defineProperty(exports, "__esModule", { value: true });
exports.activate = void 0;
const vscode = require("vscode");
const path = require("path");
const os = require("os");
const vscode_jsonrpc_1 = require("vscode-jsonrpc");
const vscode_1 = require("vscode");
const vscode_languageclient_1 = require("vscode-languageclient");
function activate(context) {
    console.log("Started Extension;");
    if (true) {
        //vscode.window.showInformationMessage('Xtext started for PackageXML!');
        // The server is a locally installed in src/packagexml
        let launcher = os.platform() === 'win32' ? 'mydsl-standalone.bat' : 'mydsl-standalone';
        let script = context.asAbsolutePath(path.join('src', 'packagexml', 'bin', launcher));
        let serverOptions = {
            run: { command: script },
            debug: { command: script, args: [], options: { env: createDebugEnv() } }
        };
        let clientOptions = {
            documentSelector: ['xml'],
            // documentSelector: [{ pattern: '**∕package.xml' }],
            synchronize: {
                fileEvents: vscode_1.workspace.createFileSystemWatcher('**/*.*')
            }
        };
        // Create the language client and start the client.
        let lc = new vscode_languageclient_1.LanguageClient('Xtext Server', serverOptions, clientOptions);
        // enable tracing (.Off, .Messages, Verbose)
        lc.trace = vscode_jsonrpc_1.Trace.Verbose;
        //vscode.window.showInformationMessage('Starting PackageXML!');
        console.log("Started PackageXML");
        let disposable = lc.start();
        //vscode.window.showInformationMessage('Started PackageXML!');
        // Push the disposable to the context's subscriptions so that the 
        // client can be deactivated on extension deactivation
        context.subscriptions.push(disposable);
    }
    // PART 2
    vscode.window.showInformationMessage('Xtext started for CMakeLists!');
    // The server is a locally installed in src/packagexml
    let launcher2 = os.platform() === 'win32' ? 'mydsl-standalone.bat' : 'mydsl-standalone';
    let script2 = context.asAbsolutePath(path.join('src', 'cmakelists', 'bin', launcher2));
    let serverOptions2 = {
        run: { command: script2 },
        debug: { command: script2, args: [], options: { env: createDebugEnv() } }
    };
    let clientOptions2 = {
        documentSelector: ['txt'],
        // documentSelector: [{ pattern: '**∕package.xml' }],
        synchronize: {
            fileEvents: vscode_1.workspace.createFileSystemWatcher('**/*.*')
        }
    };
    // Create the language client and start the client.
    let lc2 = new vscode_languageclient_1.LanguageClient('Xtext Server 2', serverOptions2, clientOptions2);
    // enable tracing (.Off, .Messages, Verbose)
    lc2.trace = vscode_jsonrpc_1.Trace.Verbose;
    //vscode.window.showInformationMessage('Starting CMakeLists!');
    console.log("Start CMakeLists");
    let disposable2 = lc2.start();
    //vscode.window.showInformationMessage('Started CMakeLists!');
    // Push the disposable to the context's subscriptions so that the 
    // client can be deactivated on extension deactivation
    context.subscriptions.push(disposable2);
}
exports.activate = activate;
function createDebugEnv() {
    return Object.assign({
        JAVA_OPTS: "-Xdebug -Xrunjdwp:server=y,transport=dt_socket,address=8000,suspend=n,quiet=y"
    }, process.env);
}
