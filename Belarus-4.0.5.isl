; *** Inno Setup version 3.0.6+ Belarusian messages (soviet orthography)***
; Translated December 2002 by Anton Kavalenka (anton@inp.minsk.by)
; Verified by Sergey Bychkov (serge_bychkov@mailru.com)
;

[LangOptions]
LanguageName=Belarusian
LanguageID=$0423
; If the language you are translating to requires special font faces or
; sizes, uncomment any of the following entries and change them accordingly.

;DialogFontName=MS Sans Serif
;DialogFontSize=8
;DialogFontStandardHeight=13

;TitleFontName=Arial
;TitleFontSize=29
;WelcomeFontName=Arial
;WelcomeFontSize=12
;CopyrightFontName=Arial
;CopyrightFontSize=8

[Messages]

; *** Application titles
SetupAppTitle=��������
SetupWindowTitle=�������� - %1
UninstallAppTitle=���������
UninstallAppFullTitle=%1 - ���������

; *** Icons
;DefaultUninstallIconName=��������� %1

; *** Misc. common
InformationTitle=����������
ConfirmTitle=������������
ErrorTitle=�������

; *** SetupLdr messages
SetupLdrStartupMessage=�������� �������� "%1". �����?
LdrCannotCreateTemp=��������� �������� ������ ����. �������� ��������
LdrCannotExecTemp=��������� ��������� ���� �  ������� �����. �������� ��������

; *** Startup error messages
LastErrorMessage=%1.%n%n������� %2: %3
SetupFileMissing=���� %1 ��������� �  ������� �����. ������� ����, ����� ��������� ����� ���� ��������.
SetupFileCorrupt=���� ������� ����������. ��������� ����� ���� ��������.
SetupFileCorruptOrWrongVer=����� ������� ����������� ��� �������������� � ������� ������ �������� �������.
NotOnThisPlatform=�������� �� ���� ���� ���������� �� %1.
OnlyOnThisPlatform=�������� ������ ���� ���������� �� %1.
WinVersionTooLowError=�������� �������� %1 ���� %2 ��� ���������.
WinVersionTooHighError=�������� �� ���� ���� ���������� �� %1 ���� %2 ��� ���������.
AdminPrivilegesRequired=����������� �������������� ������ ��� ������� ��������.
PowerUserPrivilegesRequired=����������� �������������� �� Power User ������ ��� ������� ��������.
SetupAppRunningError=�������� ������� �������, ��� ���������� �������� "%1".%n%n�������� ��� �� ��ﳳ, ����� �������� OK ��� �������, ��� ��������� ��� ������.
UninstallAppRunningError=�������� ������� �������, ��� ���������� �������� "%1".%n%n�������� ��� �� ��ﳳ, ����� �������� OK ��� �������, ��� ��������� ��� ������.

; *** Misc. errors
ErrorCreatingDir=��������� �������� ����� "%1"
ErrorTooManyFilesInDir=��������� �������� ���� � ����� "%1", �� ��� ��������� ������ �����

; *** Setup common messages
ExitSetupTitle=������� ��������
ExitSetupMessage=�������� �� ���������. ��� �� �� �� ��������, �������� �� ����� ����������.%n%n�� ����� ��������� �������� ������� �������� ��� ��� ����������.%n%n������� ��������?
AboutSetupMenuItem=&��� ��������...
AboutSetupTitle=��� ��������
AboutSetupMessage=%1 ���� %2%n%3%n%n������ �������� %1:%n%4
AboutSetupNote=

; *** Buttons
ButtonBack=< &�����
ButtonNext=&����� >
ButtonInstall=&����������
ButtonOK=OK
ButtonCancel=���������
ButtonYes=&���
ButtonYesToAll=��� ��� &���
ButtonNo=&��
ButtonNoToAll=�&� ��� ���
ButtonFinish=&��������
ButtonBrowse=&�������...

; *** "Select Language" dialog messages
SelectLanguageTitle=������� ���� ����������
SelectLanguageLabel=������� ����, ���� ����� �������������� � ��� ����������:

; *** Common wizard text
ClickNext=�������� ����� ��� ���������� ��� ��������� ��� ������.
;ClickNextModern=�������� ����� ��� ���������� ��� ��������� ��� ������.
BeveledLabel=
;InnoSetup

; *** "Welcome" wizard page
;WizardWelcome=��� ����� ���������
WelcomeLabel1=��� ���� �������� ������� �������� "[name]".
WelcomeLabel2=�������� [name/ver] ����� ����������� �� ��� ��������.%n%n����� ������������� ������� ��� ����� ��������, ����� �������� �������. ���� �������� ���������� �������� ��� ��� �������.

; *** "Password" wizard page
WizardPassword=������
PasswordLabel1=�������� ��������� �������.
PasswordLabel3=������� ������, ����� �������� ����� ��� �������. ������ ���������� �� �������.
PasswordEditLabel=&������:
IncorrectPassword=���������� ������. ����������� ���.

; *** "License Agreement" wizard page
WizardLicense=˳�������� ����������
LicenseLabel=���������� ��������� ����������, ��� ���� ��� ���������� ��������.
;LicenseLabel1=���������� ˳�������� ����������. ������������ ������� �������� ����� ������� "Page Down" ��� �������� ����������.
;LicenseLabel2=ֳ ������� �� � ��� ������ ˳��������� ����������? ��� ��, �������� ����� ���������. ��� ���������� �������� "[name]", �� ����� ������� ����� ��������� ���������.
LicenseAccepted=� &������ ����������
LicenseNotAccepted=� &�� ������ ����������
LicenseLabel3=��� ����� ���������� ��������� ��������� ����������. ��� ��������� ��������, �� ����� ������� ����� ��������� ���������.

; *** "Information" wizard pages
WizardInfoBefore=����������
InfoBeforeLabel=���������� ��������� ���������� ����� �������� �������.
InfoBeforeClickLabel=��� ������� ������ ���������� ��������, �������� �����.
WizardInfoAfter=����������
InfoAfterLabel=���������� ��������� ���������� ����� �������� �������.
InfoAfterClickLabel=��� ������� ������ ���������� ��������, �������� �����.

; Preparing setup
WizardPreparing=��������� ��������
PreparingDesc=�������� ������� ��������� ���������� [name] �� ��� ��������.
PreviousInstallNotCompleted=�������� �� ��������� ���������� �������� �� ���� ��������. ��� �������� ������������ ��� �������� ��� �������� ��������.%n%n����� �������� ��������� �������� ���� ���, ��� �������� �������� [name].
CanNotContinue=������ ���������. ��� ����� �������� "���������" ��� ������.

; *** "Select Destination Directory" wizard page
WizardSelectDir=������� ����� ��� �������
SelectDirDesc=���� ���������� �������� "[name]"?
SelectDirLabel=������� �����, � ���� �� ������� ���������� �������� "[name]", ����� �������� �����.
DiskSpaceMBLabel=�������� �������� �� ����� [mb] MB ��������� �������� ��������.
ToUNCPathname=��������� ���������� �� �����, ������������ UNC. ��� �� ��������� ���������� ������� � ����, ��������� ���������� ������� ����.
InvalidPath=��������� �������� ���� ������� ���� � ������ �������, ���������:%nC:\APP
InvalidDrive=� ������� ������� ��������� ����. ������� ����.
DiskSpaceWarningTitle=������������ ����� �� �����
DiskSpaceWarning=�������� �������� ���� ����� %1 KB ��������� ��������, ��� �� ������� ������� ����� %2 KB.%n%n��������� ���������� �� ����?
BadDirName32=����� ���� �� ���� ���������� � ���� � ��������� ��������:%n%n%1
DirExistsTitle=����� �����
DirExists=�����:%n%n%1%n%n��� �����. ���������� � ��?
DirDoesntExistTitle=����� �� �����
DirDoesntExist=�����:%n%n%1%n%n�� �����. ��������?

; *** "Select Components" wizard page
WizardSelectComponents=������� ����������
SelectComponentsDesc=��� ���������� ������ ���� �����������?
SelectComponentsLabel2=������� ���������� ��� �������; �������� ����������, ��� �� ������� ����븢����. �������� �����, ��� ������� ������� ���������� ��������.
FullInstallation=����� ��������
; if possible don't translate 'Compact' as 'Minimal' (I mean 'Minimal' in your language)
CompactInstallation=���������� ��������
CustomInstallation=�������� ��������
NoUninstallWarningTitle=������� ����������
NoUninstallWarning=�������� ������, ��� ��������� ���������� ��� ����������� �� ����� ���������:%n%n%1%n%n������������ ����� ���������� �� ������� ��.%n%n���������?
ComponentSize1=%1 KB
ComponentSize2=%1 MB
ComponentsDiskSpaceMBLabel=������� ���������� ���������� ���� ����� [mb] MB ����� �� �����.

; *** "Select Additional Tasks" wizard page
WizardSelectTasks=����� ���������� ��������
SelectTasksDesc=��� ���������� ������ �������� ��������?
SelectTasksLabel2=������� ���������� ������, ��� ��������� �������� ��� ���������� �������� "[name]", ����� �������� �����.
ReadyMemoTasks=���������� ������:

; *** "Select Start Menu Folder" wizard page
WizardSelectProgramGroup=������� ����� � ���� ����
SelectStartMenuFolderDesc=��� �������� ������� �������� ������� ��� ��������?
SelectStartMenuFolderLabel=������� ����� � ���� ����, � ���� �������� ������� �������� ������� �� ��������, ����� �������� �����.
NoIconsCheck=&�� �������� �������
MustEnterGroupName=��������� ������ ��� ����.
BadGroupName=����� ���� �� ���� �������� �������� � ��������� ��������:%n%n%1
NoProgramGroupCheck2=&�� �������� ����� � ���� ����

; *** "Ready to Install" wizard page
WizardReady=�� ����������� �� �������
ReadyLabel1=�� ����������� �� ������� �������� "[name]" �� ��� ��������.
ReadyLabel2a=�������� ���������� ��� ������� ������� ��� ����� ��� ��������� ������ ������.
ReadyLabel2b=�������� ���������� ��� ������� �������.
ReadyMemoUserInfo=���������� ��� ������������:
ReadyMemoDir=����� �������:
ReadyMemoType=��� �������:
ReadyMemoComponents=������� ����������:
ReadyMemoGroup=����� � ���� ����:

; *** "Installing" wizard page
WizardInstalling=��������
InstallingLabel=������� ������ �������� [name] ����븢������ �� ��� ��������.

; *** "Setup Completed" wizard page
;WizardFinished=�������� ���������
FinishedHeadingLabel=���������� ������� "[name]".
FinishedLabelNoIcons=�������� �������� "[name]" ���������.
FinishedLabel=�������� �������� "[name]" ���������. �������� ���� ���� ��������� ����������� ���������.
ClickFinish=�������� �������� ��� ������� ��������.
FinishedRestartLabel=��� ���������� ������� �������� "[name]", ��������� ���������� ��� ��������. ���������� �����?
FinishedRestartMessage=��� ���������� ������� �������� "[name]", ��������� ���������� ��� ��������.%n%n���������� �����?
ShowReadmeCheck=���, � ����� ���������� README ����
YesRadio=&���, ���������� �������� �����
NoRadio=&��, � ��������� ������
; used for example as 'Run MyProg.exe'
RunEntryExec=�������� %1
; used for example as 'View Readme.txt'
RunEntryShellExec=���������� %1

; *** "Setup Needs the Next Disk" stuff
ChangeDiskTitle=��������� �������� ����
SelectDirectory=������� �����
SelectDiskLabel2=������ "���� %1" � �������� OK.%n%n��� ����� �� ����� ����� ����������� � �����, ���� ����������� �� ���� ����, ������� �������� ���� ��� �������� �������.
PathLabel=&����:
FileNotInDir2=���� "%1" �� ��������� � "%2". ������ �������� ���� ��� ������� ����� �����.
SelectDirectoryLabel=�������� ����������� ���������� �����.

; *** Installation phase messages
SetupAborted=�������� �� ���������.%n%n����������� � �������� � ����� ��������� �������� ��������.
EntryAbortRetryIgnore=�������� ��������, ��� ������������ ���, �������� ��� ���������� ��� ������ ��� ������ �������.

; *** Installation status messages
StatusCreateDirs=��������� �����...
StatusExtractFiles=��������� �����...
StatusCreateIcons=��������� ���������� ��������...
StatusCreateIniEntries=��������� INI �����...
StatusCreateRegistryEntries=��������� ����� �������...
StatusRegisterFiles=���������� �����...
StatusSavingUninstall=���� ���������� ��� ������������...
StatusRunProgram=���������� �������...
StatusRollback=����� ����� �����...

; *** Misc. errors
;ErrorInternal=��������� ������� %1
ErrorInternal2=��������� ������� %1
ErrorFunctionFailedNoCode=%1 �� ��������
ErrorFunctionFailed=%1 �� ��������; ��� %2
ErrorFunctionFailedWithMessage=%1 �� ��������; ��� %2.%n%3
ErrorExecutingProgram=��������� �������� ����:%n%1

; *** "User Information" wizard page
WizardUserInfo=���������� ��� ������������
UserInfoDesc=��� �����, ������� ���� ����������.
UserInfoName=&��� ������������:
UserInfoSerial=&������� �����:
UserInfoOrg=&����������:
UserInfoNameRequired=�� ����� ������ ���.

; *** DDE errors
;ErrorDDEExecute=DDE: ������� ��� ��� "execute" ���������� (���: %1)
;ErrorDDECommandFailed=DDE: ������� �� ���� ��������� ���������
;ErrorDDERequest=DDE: ������� ��� ��� "request" ���������� (���: %1)

; *** Registry errors
ErrorRegOpenKey=������� �������� ����� �������:%n%1\%2
ErrorRegCreateKey=������� ��������� ����� �������:%n%1\%2
ErrorRegWriteKey=������� ����� � ���� �������:%n%1\%2

; *** INI errors
ErrorIniEntry=������� ��������� INI ������ � ����� "%1".

; *** File copying errors
FileAbortRetryIgnore=�������� ��������, ��� �������� ������, �������� ��� �������� ���� (�� �������������) ��� ������ ��� ���������� �������.
FileAbortRetryIgnore2=�������� ��������, ��� �������� ������, �������� ��� �������� ���� (�� �������������) ��� ������ ��� ���������� �������.
SourceIsCorrupted=������� ���� ����������
SourceDoesntExist=������� ���� "%1" �� �����
ExistingFileReadOnly=������� ���� ��� ������� "����� ��� �������".%n%n�������� �������� ��� ������ �������� � ��������� ������, �������� ��� �������� ����, ��� ������ ��� �������� �������.
ErrorReadingExistingDest=�������� ������� ��� ������ ������� ��������� �����:
FileExists=���� ��� �����.%n%n��������� ���?
ExistingFileNewer=������� ���� ����� ����, ��� ���, �� ����������. ������������� ������� �������.%n%n������� ������� ����?
ErrorChangingAttr=�������� ������� ��� ������ ����� �������� ��������� �����:
ErrorCreatingTemp=�������� ������� ��� ������ ��������� ����� � ����� ������� ��������:
ErrorReadingSource=�������� ������� ��� ������ ������� ��������� �����:
ErrorCopying=�������� ������� ��� ������ ���������� �����:
ErrorReplacingExistingFile=�������� ������� ��� ������ ������ ��������� �����:
ErrorRestartReplace=RestartReplace �� ��������:
ErrorRenamingTemp=�������� ������� ��� ������ �������������� ����� � ����� ������� ��������:
ErrorRegisterServer=��������� ������������� DLL/OCX: %1
ErrorRegisterServerMissingExport=DllRegisterServer ������� �������� �� ���������
ErrorRegisterTypeLib=��������� ������������� �������� ����: %1

; *** Post-installation errors
ErrorOpeningReadme=�������� ������� ��� ������ ��������� ����� README:
ErrorRestartingComputer=� �������� ������� �� ������������ ���������� ��������. ���������� �������.

; *** Uninstaller messages
UninstallNotFound=���� "%1" �� �����. ��������� ����������.
UninstallOpenError=���� "%1" �� ����������. ��������� ����������.
UninstallUnsupportedVer=������������� log-���� "%1" �� � ������� �� �������������� ����� ������ �������������. ������������ ���������
UninstallUnknownEntry=�������� ���� (%1) ��� ��������� � ��������������� log-�����
ConfirmUninstall=�� ������� ������� ������� ������� �������� "%1" � ��� �� ����������?
OnlyAdminCanUninstall=����� �������� ���� ���� ������������� �������� ������������� � ������ ������������.
UninstallStatusLabel=������� ������ %1 ���������� � ������ ���������.
UninstalledAll=�������� "%1" ��������� ��������� � ������ ���������.
UninstalledMost=��������� �������� "%1" ���������.%n%n��������� �������� �� ���������� �������. ��� ������ ���� ��������� �������.
UninstallDataCorrupted=���� "%1" ����������. ������������ ����������
UninstalledAndNeedsRestart=��� �������� ������������ %1, ��� �������� ����� ���� ������������.%n%n�� ������� ������ ���� �����?

; *** Uninstallation phase messages
ConfirmDeleteSharedFileTitle=������� �������� �����?
ConfirmDeleteSharedFile2=ѳ����� ��������, ��� �������� ������� ���� ����� �� ��������������� ����� ���������. ֳ ������� �� ������� ���� ������� ����?%n%n��� ��������� �������� ��-� �� �����������, � ���� ����� ��������, ����� �������� �� ������ ��������� ���������. ��� �� �� ���������, ������� ����� ��. �������� ����� � ������ �� ��� ���� ������� ������.
SharedFileNameLabel=����:
SharedFileLocationLabel=����� �����������:
WizardUninstalling=������ ���������
StatusUninstalling=�������� %1...
