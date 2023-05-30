#import <React/RCTViewManager.h>
#import <React/RCTUIManager.h>
#import "RCTBridge.h"

@interface KhanPackageViewManager : RCTViewManager
@end

@implementation KhanPackageViewManager

RCT_EXPORT_MODULE(KhanPackageView)

- (UIView *)view
{
  return [[UIView alloc] init];
}

RCT_EXPORT_VIEW_PROPERTY(color, NSString)

@end
