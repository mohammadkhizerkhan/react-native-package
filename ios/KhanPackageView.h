// This guard prevent this file to be compiled in the old architecture.
#ifdef RCT_NEW_ARCH_ENABLED
#import <React/RCTViewComponentView.h>
#import <UIKit/UIKit.h>

#ifndef KhanPackageViewNativeComponent_h
#define KhanPackageViewNativeComponent_h

NS_ASSUME_NONNULL_BEGIN

@interface KhanPackageView : RCTViewComponentView
@end

NS_ASSUME_NONNULL_END

#endif /* KhanPackageViewNativeComponent_h */
#endif /* RCT_NEW_ARCH_ENABLED */
