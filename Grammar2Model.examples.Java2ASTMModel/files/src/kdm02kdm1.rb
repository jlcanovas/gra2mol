transformation 'kdm02kdm1'
  
# Building main Segment
Segment = Kdm2::Kdm::Segment.new 


##############################################################################################
# PLATFORM MODEL
##############################################################################################

phase 'buildPlatformModel' do

# Extension elements for representing Struts applications
ExtensionFamilyStruts = Kdm::Kdm::ExtensionFamily.new
ExtensionFamilyStruts.name = "PlatformStrutsExtension"

StereotypeActionServlet = Kdm::Kdm::Stereotype.new
StereotypeActionServlet.name = "ActionServlet"
ExtensionFamilyStruts.stereotype << StereotypeActionServlet

StereotypeActionForm = Kdm::Kdm::Stereotype.new
StereotypeActionForm.name = "ActionForm"
ExtensionFamilyStruts.stereotype << StereotypeActionForm

StereotypeAction = Kdm::Kdm::Stereotype.new
StereotypeAction.name = "Action"
ExtensionFamilyStruts.stereotype << StereotypeAction

PlatformModel = Kdm::Platform::PlatformModel.new
PlatformModel.platformElement << ExtensionFamilyStruts
Segment.model << PlatformModel

# ResourceType elements for representing Struts applications
ResourceTypeActionServlet = Kdm::Platform::ResourceType.new
ResourceTypeActionServlet.name = "ActionServlet"
ResourceTypeActionServlet.stereotype << StereotypeActionServlet
PlatformModel.platformElement << ResourceTypeActionServlet

ResourceTypeActionForward = Kdm::Platform::ResourceType.new
ResourceTypeActionForward.name = "ActionForward"
PlatformModel.platformElement << ResourceTypeActionForward

ResourceTypeActionMapping = Kdm::Platform::ResourceType.new
ResourceTypeActionMapping.name = "ActionMapping"
PlatformModel.platformElement << ResourceTypeActionMapping

# Creates a DeployedComponent for each Struts Action
rule 'createDeployedComponent' do
  from Kdm::Code::ClassUnit
  to Kdm2::Platform::DeployedComponent
  filter do | cu | 
    cu.name.match(/^Action/)
  end
  mapping do | cu, dc |
    dc.name = cu.name 
    PlatformModel.platformElement << dc
  end
end

# Creates a DeployedComponent for each StrutsForm
rule 'createDeployedComponent' do
  from Kdm::Code::ClassUnit
  to Kdm2::Platform::DeployedComponent
  filter do | cu | 
    cu.name.match(/^Bean/)
  end
  mapping do | cu, dc |
    dc.name = cu.name 
    PlatformModel.platformElement << dc
  end
end


end